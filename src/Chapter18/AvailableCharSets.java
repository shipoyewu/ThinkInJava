package Chapter18;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class AvailableCharSets {
	public static void main(String args[]){
		SortedMap<String, Charset> ch = Charset.availableCharsets();
		Iterator<String> it = ch.keySet().iterator();
		while(it.hasNext()){
			String a = it.next();
			System.out.println(a);
		}
	}
}
