package Chapter18;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Endians {
	public static void main(String args[]){
		ByteBuffer bb = ByteBuffer.wrap(new byte[10]);
		bb.asCharBuffer().put("shihu");
		System.out.println(Arrays.toString(bb.array()));
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		bb.asCharBuffer().put("ok");
		System.out.println(Arrays.toString(bb.array()));
		
		
		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.asCharBuffer().put("hello");
		System.out.println(Arrays.toString(bb.array()));
		
	}
}
