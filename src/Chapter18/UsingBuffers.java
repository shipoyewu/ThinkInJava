package Chapter18;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers {
	public static void main(String args[]){
		CharBuffer c = ByteBuffer.allocateDirect(1024).asCharBuffer();
		c.put('1').put('2').put('3');
		while(c.hasRemaining()){
			c.mark();
			char c1 = c.get();
			char c2 = c.get();
			c.reset();
			c.put(c2).put(c1);
		}
		
		System.out.println(c);
	}
}
