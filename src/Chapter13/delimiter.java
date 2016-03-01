package Chapter13;

import java.util.Scanner;

public class delimiter {
	public static void main(String args[]){
		Scanner a = new Scanner("123456,123456");
		System.out.println(a.delimiter());
		a.useDelimiter("123");
		while(a.hasNext()){
			System.out.println(a.next());
		}
	}
}
