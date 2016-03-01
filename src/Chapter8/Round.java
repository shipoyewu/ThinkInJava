package Chapter8;

class Glyph{
	void draw(){
		System.out.println("Glyph.draw()");
	}
	
	Glyph(){
		System.out.println("beforce");
		draw();
		System.out.println("after");
	}
	
}
public class Round extends Glyph{
	private int radius = 1;
	Round(int r){
		System.out.println("Round   " + r);
		
	}
	void draw(){
		System.out.println("Round.draw()"  + radius);
	}
	public static void main(String args[]){
		new Round(1);
		
	}
}
