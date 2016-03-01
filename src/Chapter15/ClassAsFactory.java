package Chapter15;


//隐式的工厂模式
public class ClassAsFactory<T> {
	T x;
	public ClassAsFactory(Class<T> kind){
		try{
			x = kind.newInstance(); //必须要有默认器才可以
			
		}catch(Exception e){
			System.out.println("NO GOOD");
		}
	}
	
	public static void main(String args[]){
		ClassAsFactory<String> a = new ClassAsFactory<String>(String.class);
		System.out.println(a.x);
		ClassAsFactory<Integer> b = new ClassAsFactory<Integer>(Integer.class);
		System.out.println(b.x);
	}
}
