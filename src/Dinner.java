import Chapter4.next;
import Cookie.Cookie;
import Cookie.Protest;

public class Dinner {
	static {
		System.out.println("A");
	}
	{
		System.out.println("B");
	}
	public static void main(String args[]){
		next a = new next();
		Protest b = new Protest();
		Cookie c = new Cookie();
		
	}
	public Dinner(){
		System.out.println("Dinner");
	}
}
