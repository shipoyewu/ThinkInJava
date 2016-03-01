package Chapter14;

public class newinstance {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class a = int.class;
		System.out.println(a.newInstance().getClass());
		
	}
}
