package Chapter21;

public class Liftoff implements Runnable{
	protected int countdown = 10;
	public Liftoff() {
	}
	public Liftoff(int count){
		countdown = count;
	}
	public int status(){
		return countdown;
	}
	public void run(){
		while(countdown-- >0){
			System.out.println(status());
			Thread.yield();
		}
	}
	public static void main(String args[]){
		for(int i = 0;i < 10;i++){
			Thread a = new Thread(new Liftoff(10));
			a.start();
		}
	}
}
