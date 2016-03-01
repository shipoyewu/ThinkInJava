package Chapter13;

public class StringFomatter {
	public static void main(String args[]){
		StringBuilder a = new StringBuilder();
		a.append("1");
		System.out.println(a);
		System.out.println(String.format("%10d", 100));
	}
}
