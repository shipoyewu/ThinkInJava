package Chapter21;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskwithRes implements Callable<String>{
	private int id;
	public TaskwithRes(int id){
		this.id = id;
	}
	public String call(){
		return id+"hello";
	}
	public static void main(String args[]){
		ExecutorService a = Executors.newCachedThreadPool();
		ArrayList<Future<String>> res = new ArrayList<Future<String>>();
		
		for(int i = 0;i < 5;i++){
			res.add(a.submit(new TaskwithRes(i)));
		}
		
		for(Future<String> q:res){
			try{
				System.out.println(q.get());
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				a.shutdown();
			}
			
		}
		
	}
}
