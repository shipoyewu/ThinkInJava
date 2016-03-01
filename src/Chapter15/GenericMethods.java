package Chapter15;

public class GenericMethods {
	public static <T> void fun(T x){
		
		System.out.println(x+ " "+ x.getClass().getSimpleName());
	}
	public static void main(String args[]){
		fun(0.1);
		fun(0.1f);
		fun(1);
		fun(1.0);
		fun("0.001");
	}
}
