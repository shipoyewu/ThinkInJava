package Chapter9;

public class B extends A {
	protected void fun(){
		System.out.println("Sun");
	}
	
	public void funA(){
		fun();
	}
	
	public static void main(String args[]){
		new B().funA();
	}
}
