package Chapter21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class test implements Runnable{
	private final int id;
	public test(int id){
		this.id = id;
	}
	public void run(){
		while(!Thread.currentThread().isInterrupted()){
			System.out.println(this);
			Thread.yield();
		}
		
	}
	public String toString(){
		return "#" + id+":" +ThreadLocalTest.get(); 
	}
}
public class ThreadLocalTest {
	private static ThreadLocal<Integer> a = 
			new ThreadLocal<Integer>(){
				Random rand = new Random(47);
				protected synchronized Integer initialValue(){
					return rand.nextInt(1000);
				}
			};
	public static int get(){
		return a.get();
	}
	public static void main(String args[]){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0;i < 5;i++){
			exec.execute(new test(i));
		}
		exec.shutdown();
	}
}
