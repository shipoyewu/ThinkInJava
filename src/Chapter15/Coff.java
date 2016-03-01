package Chapter15;

class a{
	void fun(){
		System.out.println("A");
	}
}

class b{
	void fun(){
		System.out.println("B");
	}
}

class c{
	void fun(){
		System.out.println("C");
	}
}
public class Coff {
	public static void main(String args[]) throws Exception{
		Class[] types = {a.class,b.class,c.class};
		((b) types[1].newInstance()).fun();
	}
}
