package Chapter12;
import static basetool.basetools.*;
public class Finally {
	public static int fun(){
		try{
			printf("try 1");
			return 1;
		}finally{
			printf("Finally 2");
			return 2; 
		}
	
	}
	
	public static void main(String args[]){
		System.out.println("main(): "+ fun());
	}
}
