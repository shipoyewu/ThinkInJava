package Chapter21;

import java.util.concurrent.TimeUnit;

class needCleanup{
	private final int id;
	public needCleanup(int idm){
		id = idm;
	}
	public void cleanup(){
		System.out.println("cleaning up"+id);
	}
}
class block3 implements Runnable{
	private volatile double d = 0.0;
	
	public void run(){
		try{
			while(!Thread.interrupted()){
				needCleanup n1 = new needCleanup(1);
				try{
					System.out.println("Sleeping");
					TimeUnit.SECONDS.sleep(1);
					needCleanup n2 = new needCleanup(2);
					try{
						System.out.println("Calclating");
						for(int i = 1;i < 2500000;i++){
							d += (Math.PI+Math.E)/ d;
						}
					}finally{
						n2.cleanup();
					}
				}finally{
					n1.cleanup();
				}
			}
			System.out.println("Exiting via while() test");
		}catch(Exception e){
			System.out.println("Exiting via Inter");
		}
	}
}
public class InterruptinggIdim {
	public static void main(String[] args ) throws Exception{
		Thread t = new Thread(new block3());
		t.start();
		TimeUnit.SECONDS.sleep(1);
		t.interrupt();
	}
}
