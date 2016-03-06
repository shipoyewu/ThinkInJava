package Chapter21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable{
	private Chopstick left;
	private Chopstick right;
	private final int id;
	
	public Philosopher(Chopstick left,Chopstick right,int id) {
		this.left = left;
		this.right = right;
		this.id  = id;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
//				TimeUnit.MILLISECONDS.sleep(new Random(47).nextInt(100));
				System.out.println(this+"Thinking");
				if(!right.take()) continue;;
				if(!left.take()){
					right.drop();
					continue;
				}
//				TimeUnit.MILLISECONDS.sleep(new Random(47).nextInt(100));
				System.out.println(this+"Eating");
				right.drop();
				left.drop();
			}
		}catch(InterruptedException e){
			System.out.println("Ening "+ id);
		}
	}
	public String toString(){
		return "PHI"+ id;
	}
	public static void main(String args[]) throws InterruptedException{
		Chopstick[] ch =  new Chopstick[5];
		for(int i = 0;i < 5;i++){
			ch[i] = new Chopstick();
		}
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0;i < 5;i++){
			exec.execute(new Philosopher(ch[i], ch[(i+1)%5], i));
		}
		TimeUnit.SECONDS.sleep(10);
		exec.shutdownNow();
	} 
}
