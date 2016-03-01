package Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
	public static void main(String args[]){
		String a = "abcdeecbabc";
		
		Pattern p = Pattern.compile("(abc)+");
		Matcher m = p.matcher(a);
		System.out.println("groupCount: " + m.groupCount());
		
		while(m.find()){
			System.out.println("" + m.group(1));
			System.out.println(m.start() + " " + m.end());
		}
	}
}
                                                                                             