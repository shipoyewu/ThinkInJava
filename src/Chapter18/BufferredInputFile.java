package Chapter18;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferredInputFile {
	public static String read(String filename) throws Exception{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(filename));
		int s;
		StringBuilder sb = new StringBuilder();
		while((s = in.read()) != -1){
			sb.append((char)s);
		}
		in.close();
		return sb.toString();
	}
	public static String readByReader(String filename) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = in.readLine())!= null){
			sb.append(s+'\n');
		}
		in.close();
		return sb.toString();
	}
	public static void main(String args[])
		throws Exception{
		System.out.println(read("C:/Users/BenBen/Desktop/a.txt"));
		System.out.println(readByReader("C:/Users/BenBen/Desktop/a.txt"));
	}
}
