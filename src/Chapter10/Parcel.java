package Chapter10;

interface Contents{
	int value();
	
}

interface Destination{
	String readlabel();
}


public class Parcel {
	private class pcontents implements Contents{
		public int value(){
			return 11;
		}
		
	}
	public Contents fun(){
		return new pcontents();
	}
	public static void main(String args[]){
		Parcel p = new Parcel();
		pcontents c = p.new pcontents();
		
		Contents a = p.fun();
		System.out.println(a.value());
	}
}

class a{
	public void test(){
		Parcel a =new Parcel();
		Contents b = a.fun();
		System.out.println(b.value());
		
	}
}
