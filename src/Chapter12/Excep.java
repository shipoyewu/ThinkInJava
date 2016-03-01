package Chapter12;

class A extends Exception{}
class B extends A{}



public class Excep {
	public static void main(String args[]){
		try{
			throw new A();
			
		}catch(B a){
			System.out.println("1 A");
		}catch(Exception c){
			throw new RuntimeException(c);
		}
		
	}
}
