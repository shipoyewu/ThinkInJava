package Chapter18;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Redirecting {
	public static void main(String args[]) throws Exception {
		
		System.setIn(new BufferedInputStream(new FileInputStream(new File("./src/Chapter18/w"))));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while((s=in.readLine())!=null){
			out.write(s);
		}
		in.close();
		out.flush();
		out.close();
	}
}
