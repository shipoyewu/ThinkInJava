package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class shuffle {
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6));
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		
	}
}
