package Chapter21;

class Sleeper extends Thread{
	private int duration;
	public Sleeper(int size){
		super();
		duration = size;
		start();
	}
	public void run(){
		try{
			sleep(duration);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("sleep ok!");
	}
}
class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper s){
		super(name);
		sleeper  = s;
		start();
	}
	public void run(){
		try{
			sleeper.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(getName() +" join c");
	}
}
public class Joining {
	public static void main(String args[]){
		Sleeper sleepy = new Sleeper(100),
				grumpy = new Sleeper(100);
		Joiner join = new Joiner("shihu", sleepy),
			   uw = new Joiner("benben", grumpy);
		
		grumpy.interrupt();
	}
}
