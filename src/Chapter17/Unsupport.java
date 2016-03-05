package Chapter17;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Unsupport {
	static void test(String msg,List<String> list){
		Collection<String> c = list;
		Collection<String> sublist = list.subList(1, 8);
		Collection<String> c2 = new ArrayList<String>(sublist);
		
		try{
			c.retainAll(c2);
			
		}catch(Exception e){
			System.out.println("ret" + e);
		}
	}
	
	public static void main(String[] args[]){
		List<String> list = Arrays.asList("A B C D E F G H I J K L M N O P Q".split(" " ));
		test(" ",new ArrayList<String>(list));
		
	}
}
