package Chapter21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class car{
	private boolean waxon = false;
	public synchronized void waxed(){
		waxon = true;
		notifyAll();
	}
	public synchronized void buffed(){
		waxon = true;
		notifyAll();
	}
	public synchronized void waitForWaxing() throws InterruptedException{
		while(waxon == false) wait();
	}
	public synchronized void waitForBuffing() throws InterruptedException{
		while(waxon == true) wait();
	}
}

class Waxon implements Runnable{
	private car ca; 	
	public Waxon(car c){
		ca = c;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				System.out.println("wax on!");
				TimeUnit.MICROSECONDS.sleep(200);
				ca.waxed();
				ca.waitForBuffing();
			}
		}catch(Exception e){
			System.out.println("Exting via interr");
		}
		System.out.println("ending wax on task");
	}
}

class waxoff implements Runnable{
	private car ca;
	public waxoff(car c){
		ca = c ;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				ca.waitForWaxing();
				System.out.println("Wax off!");
				TimeUnit.MILLISECONDS.sleep(20);
				ca.buffed();
			}
		}catch(InterruptedException e){
			System.out.println("Exiting via In");
		}
		System.out.println("Ending off task");
	}
}
public class WaxOMatic {
	public static void main(String args[]) throws Exception {
		car ca = new car();
		ExecutorService exec =  Executors.newCachedThreadPool();
		exec.execute(new Waxon(ca));
		exec.execute(new Waxon(ca));
		TimeUnit.MILLISECONDS.sleep(5000);
		exec.shutdownNow();
		
	}
}
