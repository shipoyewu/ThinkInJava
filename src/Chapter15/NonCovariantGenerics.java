package Chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class fruit{}
class apple extends fruit {}

public class NonCovariantGenerics {

	public static void main(String args[]){
		List<? extends fruit> a = Arrays.asList(new apple(),new fruit());
		System.out.println(a.get(1));
	}
}
