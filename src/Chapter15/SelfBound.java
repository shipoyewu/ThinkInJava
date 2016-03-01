package Chapter15;

class Bound<T>{
	T e;
	void set(T args){
		e = args;
	}
	T get(){
		return e;
	}
	void f(){
		System.out.println(e.getClass().getSimpleName());
	}
}
public class SelfBound extends Bound<SelfBound> {
	public static void main(String args[]){
		SelfBound a = new SelfBound();
		a.set(new SelfBound());
		a.get();
		a.f();
	}
}
