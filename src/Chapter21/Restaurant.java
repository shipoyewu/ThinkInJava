package Chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Meal{
	private final int ordername;
	public Meal(int si){
		ordername = si;
	}
	public String toString(){
		return "Meal" + ordername;
	}
}


class WaitPerson implements Runnable{
	private Restaurant res;
	public WaitPerson(Restaurant r){
		res = r;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					while(res.m == null){
						wait();
					}
				}
				System.out.println("waitperson:" + res.m);
				synchronized(res.chef){
					res.m = null;
					res.chef.notifyAll();
				}
			}
		}catch(InterruptedException e){
			System.out.println("Waitperson interrupted");
		}
	}
}

class Chef implements Runnable{
	private Restaurant res;
	private int count = 0;
	public Chef(Restaurant r){
		res = r;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					while(res.m != null){
						wait();
					}
				}
				if(++count == 10){
					System.out.println("out of food,closing");
					res.exec.shutdownNow();
				}
				System.out.println("Order up");
				synchronized(res.wp){
					res.m = new Meal(count);
					res.wp.notifyAll();
				}
			}
		}catch(InterruptedException e){
			System.out.println("Chef Interper");
		}
	}
}
public class Restaurant {
	Meal m;
	ExecutorService exec = Executors.newCachedThreadPool();
	WaitPerson wp = new WaitPerson(this);
	Chef chef= new Chef(this);
	public Restaurant(){
		exec.execute(wp);
		exec.execute(chef);
	}
	public static void main(String args[]){
		new Restaurant();   
		
	}
}
