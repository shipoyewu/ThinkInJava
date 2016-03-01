package Chapter10;

import javax.net.ssl.ExtendedSSLSession;

class G{
	
}

abstract class E{
	abstract void fun();
}
class F extends G{
	E makeE(){
		return new E(){
			void fun(){
				System.out.println("INT");
			}
		};
		
	}
}

public class Test {
	public static void main(String args[]){
		new F().makeE().fun();
	}
}
