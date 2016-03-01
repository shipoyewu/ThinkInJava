package Chapter7;

public class Final {
	
	public void test(A c){
		c.a = 10;
		System.out.println(c.a);
		c = new A();
		c.a = 19;
		System.out.println(c.a);
   	}
	final int a;
	public Final(){
		a = 10;
	}
	
	public static void main(String args[]){
		A a = new A();
		a.a = 11;
		Final f = new Final();
		f.test(a);
		System.out.println(a.a);
	}
}
class A{
	int a;
}
