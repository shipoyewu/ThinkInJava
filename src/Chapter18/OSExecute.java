package Chapter18;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class OSExecute {
	public static void command(String command){
		boolean err = false;
		try{
			Process pro =  new ProcessBuilder(command.split(" ")).start();
			BufferedReader results = new BufferedReader(
					new InputStreamReader(pro.getInputStream()));
			String s;
			
			while((s = results.readLine())!=null){
				System.out.println(s);
			}
			BufferedReader errors  = new BufferedReader(new InputStreamReader(pro.getErrorStream()));
			
			while((s=errors.readLine())!=null){
				System.err.println(s);
				err = true;
			}
			
		}catch(Exception e){
			if(!command.startsWith("CMD /C"))
				command("CMD /C"+command);
			else
				throw new RuntimeException(e);
		}
		if(err){
		}
	}
}
