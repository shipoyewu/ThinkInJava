package Chapter21;

import java.util.concurrent.TimeUnit;

public class SetDaemon implements Runnable{
	
	public void run(){
		while(true){
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			System.out.println(Thread.currentThread()+" "+this);
		}
	}
	public static void main(String args[]) throws Exception {
		for(int i = 0;i < 9;i++){
			Thread darmon = new Thread(new SetDaemon());
			darmon.setDaemon(true);
			darmon.start();
		}
		System.out.println("All daemon is OKing");
		TimeUnit.MILLISECONDS.sleep(10000);;
		
	}
}
