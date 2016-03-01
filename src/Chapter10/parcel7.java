package Chapter10;

class content{
	int value(){
		return 12;
	}
	
}
public class parcel7 {
	public content fun(){
		return new content(){
			int i = 11;
			public int value(){
				return i;
			}
		};
		
	}
	
	public static void main(String args[]){
		System.out.println(new parcel7().fun().value());
		
	}
}
