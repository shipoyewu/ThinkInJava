package Chapter15;

import java.awt.color.ICC_ColorSpace;

public class SimpleHold<T> {
	Class<T> kind;
	public boolean f(Object a){
		return kind.isInstance(a);
	}
	public Class<T> create(Class<T> a){
		this.kind =  a;
		return kind;
	}
	public static void main(String args[]){
		SimpleHold<String> a = new SimpleHold<String>();
		Class<String> b =  a.create(String.class);
		System.out.println(a.f(new Integer(10)));
		
	}
	
}
