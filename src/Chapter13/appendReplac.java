package Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class appendReplac {
	public static void main(String args[]){
		StringBuffer a = new StringBuffer();
		StringBuffer sb = new StringBuffer(); 
		Pattern p = Pattern.compile("shihu");
		Matcher m = p.matcher("shihushihushihu");
		while(m.find()){
//			m.appendReplacement(a, "asdasd");
			m.replaceFirst("ww");
			m.appendTail(sb);
			System.out.println(a);
			System.out.println(sb);
		}
	}
}
