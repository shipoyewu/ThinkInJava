package Chapter15;

public class GenericArray<T> {
	
	public T[] fun(T a){
		T[] w = (T[]) new Object[15];
		return w;
		
	}
	public static void main(String args[]){
		System.out.println(new GenericArray<String>().fun(new String()).getClass());
		
	}
	
}
