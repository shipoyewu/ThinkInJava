package Chapter16;

import java.util.Random;

import org.omg.CORBA.PRIVATE_MEMBER;

import Chapter16.Fill.Generator;

public class Fill {
	interface Generator<T>{
		public T next();
	}
	class Boolean implements Generator<java.lang.Boolean>{
		private boolean value = false;
		public java.lang.Boolean next() {
			value =!value;
			return value;
		}
	}
	class Int implements Generator<java.lang.Integer>{
		public java.lang.Integer next() {
			return new Random().nextInt(100);
		}
	}
	class Double implements Generator<java.lang.Double>{
		public java.lang.Double next() {
			return new Random().nextDouble();
		}
	}
	class String implements Generator<java.lang.String> {
		static final java.lang.String abc = "abcdeefghijklmnopqwuzxyr";
		
		public java.lang.String next(){
			StringBuilder a = new StringBuilder("");
			int len = new Random().nextInt(100);
			Random ran = new Random();
			
			for(int i = 0;i < len;i++){
				a.append("" + abc.charAt(ran.nextInt(abc.length())));
			}
			return a.toString();
		}
	}
	void fill(Class<?> n,int size){
		
		for(int i = 0;i < size;i++){
			try{
				System.out.println(((Generator<?>)n.newInstance()).next());
			}catch(Exception e){
				throw new RuntimeException();
			}
		}
	}
	public static void main(java.lang.String args[]){
		new Fill().fill(new Fill().new Boolean().getClass(), 100);
	}
}
