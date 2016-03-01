package Chapter12;

public class Except {
	public static void f() throws Exception{
		System.out.println("in f():");
		throw new Exception("from f()");
	}
	
	public static void g() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("In G()");
			e.printStackTrace();
		}
		try{
			f();
		}catch(Exception e){
			e.printStackTrace();
			throw (Exception)e.fillInStackTrace();
		}
	}
	public static void main(String args[]){
		try{
			g();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
}
