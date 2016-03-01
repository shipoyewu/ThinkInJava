package Chapter15;

import java.util.ArrayList;

class Holder<T>{}

public class CaptureConversion {
	static <T> void f1(Holder<T> f){
		System.out.println(f.getClass().getSimpleName());
	}
	static void f2(Holder<?> hold){
		f1(hold);
	}
	static <T> T f(T t){
		System.out.println("1");
		return t;
	}
	public static void main(String args[]){
		Holder raw = new Holder<Integer>();
		f2(raw);
		Holder<?> wild = new Holder<Double>();
		f2(wild);
		CaptureConversion.<Integer>f(1);
		
		
	}
}
