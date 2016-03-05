package Chapter21;

import java.io.IOException;

public class Respons extends Thread{
	public Respons(){
		setDaemon(true);
		start();
	}
	public void run(){
		while(true){
			d += (Math.PI+ Math.E) / d;
			System.out.println(d);
			
		}
	}
	static volatile double d = 1;
	public static void main(String args[]) throws IOException{
		new Respons();
		while(true){
			System.in.read();
		}
	}
}
