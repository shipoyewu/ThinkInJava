package Chapter11;

import java.util.HashMap;

public class MyMap {
	public static void main(String args[]){
		HashMap<String, String> ma =  new HashMap<String,String>();
		for(int i = 0;i < 10;i++){
			ma.put(new String(i+""), new String(i+""));
		}
		
		for(String s: ma.keySet()){
			System.out.println(s + " " + ma.get(s));
		}
	}
}
