package Chapter14;

import java.lang.reflect.Method;

class Q{
	private void name() {
		System.out.println("A");
	}
}
public class CallhHideMethod {
	public static void main(String args[]) throws Exception{
		Q a = new Q();
		Method g = a.getClass().getDeclaredMethod("name");
		System.out.println(g);
		g.setAccessible(true);
		g.invoke(a);
	}
}
