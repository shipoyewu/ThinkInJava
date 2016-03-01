package Chapter15;

class tuple<T,V>{
	T t;
	V v;
	
	public tuple(T t,V v){
		this.t = t;
		this.v = v;
	}
}

public class TupleTest {
	static tuple<String,String> fun(){
		return new tuple<String,String>("100","100");
	}
	static tuple fun1(){
		return new tuple("100","100");
	}
}
