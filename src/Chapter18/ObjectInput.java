package Chapter18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInput {
	public static void main(String args[]) throws Exception{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("shihu.txt"));
		Alian a = (Alian)in.readObject();
		System.out.println(a.getClass());
	}
}
