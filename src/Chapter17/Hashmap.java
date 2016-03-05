package Chapter17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;import java.util.Map.Entry;
import java.util.Set;

class Test{
	int i;
	public Test(int i){
		this.i = i;
	}
	public int hashCode(){
		return i; 
	}
}
public class Hashmap {
	public static void main(String args[]){
		HashMap<Test,String> a = new HashMap<Test,String>();
		Test q = new Test(1);
		a.put(q,"w");
		for(Entry<Test,String> entry:a.entrySet()){
			System.out.println(entry.getKey().hashCode());
			System.out.println(entry.getValue());
		}
		a.put(new Test(2), "Sh");
		
		System.out.println(a.get(q)); 
		System.out.println(a.get(new Test(2)));
		
	}
}
