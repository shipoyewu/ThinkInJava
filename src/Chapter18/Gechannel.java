package Chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Gechannel {
	private final static int BSIZE=1024;
	
	public static void main(String args[]) throws Exception{
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("shihu".getBytes()));
		fc.close();
		
		fc =  new FileInputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining()){
			System.out.println((char)buff.get());
		}
	}
}
