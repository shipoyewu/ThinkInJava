package Chapter16;

import java.util.Arrays;
import java.util.regex.Pattern;

public class MultiArray {
	public static void main(String args[]){
		int[][][] a = new int[2][3][4];
		System.out.println(Arrays.deepToString(a));
		String q = Arrays.deepToString(a);
		String c = q.replace('[','\0').replace(']', '\0');
		System.out.println(c);
	}
}
