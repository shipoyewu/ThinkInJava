package Chapter21;

import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;

interface Generator<T>{
	public T next();
}
class BasicGenerator<T> implements Generator<T>{
	private Class<T> t;
	
	public BasicGenerator(Class<T> t) {
		this.t = t;
	}
	
	@Override
	public T next() {
		T tmep = null;
		try{
			tmep = t.newInstance();
		}catch(Exception e){
			throw new RuntimeException();
		}
		return tmep;
		
	}
}

class ExchangerProducer<T> implements Runnable{
	private Generator<T> generator;
	private Exchanger<List<T>> exchager;
	private List<T> holder;
	public ExchangerProducer(Exchanger<List<T>> exchg,
			Generator<T> gen,List<T> holder) {
		exchager = exchg;
		generator = gen;
		this.holder = holder;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				for(int i = 0;i < ExchangeDemo.size;i++){
					holder.add(generator.next());
				}
				holder = exchager.exchange(holder);
			}
		}catch(Exception e){
			
		}
	}
}

class ExchangeConsumer<T> implements Runnable{
	private Exchanger<List<T>> exchager;
	private List<T> holder;
	private volatile T value;
	public ExchangeConsumer(Exchanger<List<T>> ex,List<T> holder) {
		exchager = ex;
		this.holder = holder;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				holder = exchager.exchange(holder);
				for(T x:holder){
					value = x;
					holder.remove(x);
				}
			}
		}catch(Exception e){
			
		}
		System.out.println("Final vlaue:" + value);
	}
}

public class ExchangeDemo {
	static int size = 10;
	static int delay = 5;
	public static void main(String args[]) throws Exception {
	}
}
