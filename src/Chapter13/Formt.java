package Chapter13;

import java.util.Formatter;

public class Formt {
	public static void main(String args[]){
		Formatter a = new Formatter(System.out);
		a.format("123 %d %d", 123,123);
		
	}
}
