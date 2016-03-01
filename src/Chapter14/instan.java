package Chapter14;

class D {}
class w extends D{}



public class instan {
	public static void main(String args[]){
		D aa  = new D();
		w bb = new w();
		if(aa instanceof D) System.out.println("A y");
		if(bb instanceof D) System.out.println("B y");
	}
}
