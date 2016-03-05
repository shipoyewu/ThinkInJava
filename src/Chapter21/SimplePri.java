package Chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimplePri implements Runnable{
	private int count = 5;
	private volatile double  d;
	private int priority;
	
	private SimplePri(int priority){
		this.priority = priority;
	}
	public String toString(){
		return Thread.currentThread() + " : " + count;
		
	}
	public void  run(){
		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i = 1;i < 10000;i++){
				d += (Math.PI + Math.E)/ (double) i;
				if(i % 1000 == 0){
					Thread.yield();
				}
			}
			System.out.println(this);
			if(--count == 0){
				return;
			}
		}
		
	}
	public static void main(String args[]){
		ExecutorService se = Executors.newCachedThreadPool();
		for(int i = 0;i < 5;i++){
			se.execute(new SimplePri(Thread.MIN_PRIORITY));
		}
		se.execute(new SimplePri(Thread.MAX_PRIORITY));
	}
}
