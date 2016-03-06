package Chapter21;

public class Chopstick {
	public boolean taken = false;
	public synchronized boolean take() throws InterruptedException{
		if(taken) return false;
		taken = true;
		return true;
	}
	public synchronized void drop(){
		taken = false;
	}
}
