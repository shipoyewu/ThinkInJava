package Chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class New {
	public static <K,V> Map<K, V> map(){
		return new HashMap<K, V>();
	}
	
	public static void main(String args[]){
		Map<String,String> ma = New.map();
		ma.put("String", "String");
		for(Entry<String,String> en: ma.entrySet()){
			System.out.println(en.getKey()+en.getValue());
		}
	}
}
