package Chapter13;

public class ToString {
	void fun(){
		System.out.println(this);
	}
	public String toString(){
		return "a"+this+"a";
	}
	public static void main(String args[]){
		System.out.println("shihua".contains("a"));
		System.out.println("shihua".contentEquals("shihu"));
	}
}
