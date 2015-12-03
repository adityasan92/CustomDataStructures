
public class QueueLinkedList<E> {

	private Node first, last; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(E item){
		Node oldElement = last;
		last = new Node();
		last.item = item; 
		last.next = null;
		if(isEmpty()){
			first = last;
		}else{
			oldElement.next = last; 
		}
	}
	
	public  E dequeue(){
		E item = first.item;
		first = first.next; 
		if(isEmpty()) last = null;
		return item; 
	}
	
	private class Node{
		E item;
		Node next; 
	}

}
