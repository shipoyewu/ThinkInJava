package Chapter15;

public class stack {
	private class Node<A>{
		A item;
		Node<A> next;
		Node(){
			item = null;
			next = null;
		}
		Node(A item,Node<A> next ){
			this.item = item;
			this.next = next;
		}
		
		
	}
}
