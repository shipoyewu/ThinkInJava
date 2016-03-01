package Chapter14;

class A{
	static{
		System.out.println("OK!");
	}
}
class B extends A{
	static {
		System.out.println("B");
	}
}
public class classforname {
	public static void main(String args[]){
		try{
			
			Class.forName("Chapter14.B");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
