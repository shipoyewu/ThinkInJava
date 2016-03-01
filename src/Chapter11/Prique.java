package Chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

class ite implements Iterable<String> {
	protected String[] word = "I love you".split(" ");
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		
		return new Iterator<String>() {
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < word.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return word[index++];
			}
			
		};
	}
	
}
public class Prique {
	public static void main(String args[]){
		PriorityQueue<Integer> pri = new PriorityQueue<Integer>(Collections.reverseOrder());
		pri.addAll(Arrays.asList(1,1,2,3,4,5));
		System.out.println(pri);
		System.out.println(pri.poll());
		for(String s: new ite()){
			System.out.println(s);
		}
	}
}
