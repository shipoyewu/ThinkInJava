package Chapter18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFiles {
	public static void main(String args[]) throws FileNotFoundException, IOException{
		int length = 0x8fffff;
		MappedByteBuffer out = new RandomAccessFile("data.txt", "rw").getChannel()
				.map(FileChannel.MapMode.READ_WRITE, 0, length);
		for(int i = 0;i < length;i++){
			out.put((byte)'x');
		}
	
	}
}
