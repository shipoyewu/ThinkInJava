package Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;
import static basetool.basetools.printf;

class snow{}
class powder extends snow {}
class light extends powder{}
class heavy extends powder{}

public class Colle {
	static void fill(Map<String, String> a){
		a.put("123", "123");
		a.put("124", "100");
		a.put("120","122  0");
		
	}
	public static void main(String args[]){
		List<powder> snow1 = Arrays.<powder>asList(new light(),new heavy());
		HashMap<String,String> a = new HashMap<String,String>();
		TreeMap<String,String> b = new TreeMap<String,String>();
		LinkedHashMap<String,String> c = new LinkedHashMap<String,String>();
		fill(a);
		fill(b);
		fill(c);
		printf(a);
		printf(c.get("123"));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
