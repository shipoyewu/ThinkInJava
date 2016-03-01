package Chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> make){
		this.kind = make;
	}
	
	@SuppressWarnings("unchecked")
	T[] create(int size){
		return (T[])Array.newInstance(kind,size); 
	}
	public static void main(String args[]){
		ArrayMaker<String> stringmake = new ArrayMaker<String>(String.class);
		String[]  strings = stringmake.create(9);
		System.out.println(Arrays.toString(strings));
	}
}
