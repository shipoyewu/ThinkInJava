package Chapter21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Calcul implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		int n = 5;
		int s = 1,t = 1,res = 0;
		for(int i = 0;i < n;i++){
			res += s;
			int tmp  = s;
			s = t;
			t = tmp+t;
		}
		return res;
	}
	public static void main(String[] args){
		Thread a = new Thread(new get());
		a.start();
		System.out.println("q");
	}
	
}
class get implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ExecutorService a = Executors.newCachedThreadPool();
		Future<Integer> q = a.submit(new Calcul());
		while(true){
			if(q.isDone()){
				try{
					System.out.println("1");
					System.out.println(q.get());
				}catch(Exception e){
					System.out.println(e);
				}finally {
					a.shutdown();
				}
				break;
			}
		}
	}
}