package Chapter15;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompleTest {
	public static void main(String args[]){
		List<? extends fruit> a =  Arrays.asList(new apple());
		System.out.println(a.contains(new apple()));
		System.out.println(a.indexOf(new apple()));
	}
}
