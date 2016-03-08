package Chapter18;

import java.io.StringReader;

public class MemoryInput {
	public static void main(String args[]) throws Exception {
		StringReader in = new StringReader("shihu a shihu,is no ok?");
		int c;
		while((c = in.read())!=-1){
			System.out.print((char)c);
		}
	}
}
