package Chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

class g{}

//java SE5引入的新型转型形式---泛型类


public class ClassCasting {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
		List<g> l = List.class.cast(in.readObject());
		System.out.println(l);
	}
}
