package Chapter18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OSExecuteDemo {
	public static void main(String args[]) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = in.readLine())!=null){
			OSExecute.command("dir");
		}
		
	}
}
