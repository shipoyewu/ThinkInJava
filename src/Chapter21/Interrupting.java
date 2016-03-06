package Chapter21;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class SleepBlocked implements Runnable{
	public void run(){
		try{
			TimeUnit.SECONDS.sleep(100);
		}catch(InterruptedException e){
			System.out.println("Inter :: ");
		}
	}
}
class IOBlocked implements Runnable {
	private InputStream in;
	public IOBlocked(InputStream in){
		this.in = in;
	}
	public void run(){
		try{
			System.out.println("Wait for read");
			in.read();
		}catch(Exception e){
			
		}
		
	}
}
public class Interrupting {
	private static ExecutorService exec = 
			Executors.newCachedThreadPool();
	static void test(Runnable r) throws Exception{
		Future<?> f = exec.submit(r);
		System.out.println("1AS" + r.getClass().getName());
		f.cancel(true);
		System.out.println("Inter : a" + r.getClass().getName());
	}
			
}
