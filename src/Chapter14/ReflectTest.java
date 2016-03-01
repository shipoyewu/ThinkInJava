package Chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ReflectTest {
	
	public static void main(String args[]){
		Pattern p = Pattern.compile("\\w+\\.");
		
		Class<?> a = instan.class;
		Method[] ml = a.getMethods();                                              
		for(Method c : ml){
			System.out.println(p.matcher(c.toString()).replaceAll(""));
			
		}
		Constructor[] cl = a.getConstructors();
		for(Constructor c: cl){
			System.out.println("c  "+ " "+c);
		}
	}
}
