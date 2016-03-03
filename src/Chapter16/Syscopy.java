package Chapter16;

import java.util.Arrays;

public class Syscopy {
	public static void main(String[] args){
		int[] a = new int[100];
		for(int i = 0;i < 100;i++){
			a[i] = i;
		}
		int[] b = new int[100];
		System.arraycopy(a,0,b,10, 10);
		for(int i = 0;i < b.length;i++){
			System.out.println(b[i]);
		}
	}
}
