package Chapter11;

import java.util.Map;

public class Environ {
	public static void main(String args[]){
		for(Map.Entry entry: System.getenv().entrySet()){
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
	}
}

