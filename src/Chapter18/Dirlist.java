package Chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Dirlist {
	public static void main(String args[]){
		File path = new File("../ThinkInJava/src");
		String[] list = path.list(new DirFilter("[a-z|A-Z]+.java"));
		for(String l: list){
			System.out.println(l);
		}
	}
}
class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex){
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir,String name){
		return pattern.matcher(name).matches();
	}
}
