package Chapter21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Pool<T> {
	private int size;
	private List<T>  items = new ArrayList<T>();
	private volatile boolean[] checkout;
	private Semaphore available;
	
	public Pool(Class<T> classobject,int size){
		this.size = size;
		checkout = new boolean[size];
		for(int i = 0;i < size;i++){
			try{
				items.add(classobject.newInstance());
			}catch(Exception e ){
				throw new RuntimeException();
			}
		}
	}
	public T checkout() throws InterruptedException{
		available.acquire();
		return getItem();
	}
	public void checkin(T x){
		if(releaseItem(x))
			available.release();
	}
	public synchronized T getItem(){
		for(int i =0;i < size;i++){
			if(!checkout[i]){
				checkout[i] = true;
				return items.get(i);
			}
		}
		return null;
	}
	public synchronized boolean releaseItem(T item){
		int index = items.indexOf(item);
		if(index == -1) return false;
		if(checkout[index]){
			checkout[index] = false;
			return true;
		}
		return false;
	}
	
}
