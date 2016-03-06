package Chapter21;

class DualSynch{
	private Object sync = new Object();
	public synchronized void f(){
		for(int i = 0;i < 500;i++){
			System.out.println("f()");
			Thread.yield();
		}
	}
	public void g(){
		synchronized (sync){
			for(int i = 0;i < 900;i++){
				System.out.println("g()");
				Thread.yield();
			}
		}
	}
}
public class SyncObject {
	public static void main(String args[]){
		final DualSynch ds = new DualSynch();
		new Thread(){
			public void run(){
				ds.f();
			}
		}.start();
		ds.g();
	}
}
