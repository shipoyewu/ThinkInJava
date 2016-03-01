package Chapter11;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import static basetool.basetools.*;

public class Mylist {
	static void fill(ArrayList<Integer> a,int n){
		Random b = new Random();
		
		for(int i = 0;i < n;i++){
			a.add(new Integer(i));
		}
	}
	
	static void fun(ListIterator<Integer> a){
		while(a.hasNext()){
			printf(a.next() + " " + a.nextIndex()+ " " + a.previousIndex());
		}
	}
	public static void main(String args[]){
		ArrayList<Integer> a = new ArrayList<Integer>();
		fill(a, 10);
		LinkedList<Integer> b =  new LinkedList<Integer>();
		for(int i = 0;i < 10;i++)
			b.add(new Integer(100+ i ));
		System.out.println(b.peek());
		System.out.println(b.poll());
		System.out.println(b.element());
		System.out.println(b.getFirst());
		System.out.println(b.isEmpty());
		
	}
}
