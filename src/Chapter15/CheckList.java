package Chapter15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class cat{}
class dog{}
public class CheckList {
	@SuppressWarnings("unchecked")
	static void oldstyleMethod(List op){
		op.add(new cat());
		System.out.println("Old");
	}
	public static void main(String args[]){
		//old
		List<dog> d = new ArrayList<dog>();
		oldstyleMethod(d);
		
		try{
			dog a = d.get(0);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		//Java SE5 之后的版本、
		
		List<dog> q = Collections.checkedList(d,dog.class);
		try{
			oldstyleMethod(q);
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
