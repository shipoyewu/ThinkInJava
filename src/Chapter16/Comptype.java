package Chapter16;

import java.util.Arrays;
import java.util.Collections;

public class Comptype implements Comparable<Comptype>{
	int a;
	@Override
	public int compareTo(Comptype o) {
		return a < o.a ? -1 : 1;
	}
	public static void main(String args[]){
		Comptype[]  a = new Comptype[19];
		for(int i = 0;i < a.length;i++){
			a[i] = new Comptype();
			a[i].a = 19-i;
		}
		for(Comptype com : a){
			System.out.print(com.a);
		}
		System.out.println();
		Arrays.sort(a);
		for(Comptype com : a){
			System.out.print(com.a);
		}
		System.out.println("");
		Arrays.sort(a,Collections.reverseOrder());
		for(Comptype com : a){
			System.out.print(com.a);
		}
		

	}
}
