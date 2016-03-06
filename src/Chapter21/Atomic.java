package Chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic implements Runnable{
	private AtomicInteger i = new AtomicInteger(0);
	public int getValue(){
		return i.get();
	}
	public void evenIncre(){
		i.addAndGet(2);
	}
	public void run(){
		while(true){
			evenIncre();
		}
	}
	public static void main(String args[]){
		ExecutorService q = Executors.newCachedThreadPool();
		Atomic ait = new Atomic();
		q.execute(ait);
		while(true){
			int val = ait.getValue();
			if(val % 2 != 0){
				System.out.println(""+val);
				System.exit(0);
			}
		}
	}
}
