package Chapter18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectOut {
	public static void main(String args[])throws Exception{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("shihu.txt"));
		out.writeObject(new Alian());
	}
}
