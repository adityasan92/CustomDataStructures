
public class QueueLinkedList<E> {

	private Node first, last; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.dequeue();
		queue.print();
		
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
	
	public void print(){
		Node temp = first; 
		while(temp != null){
			System.out.println(temp.item);
			temp = temp.next; 
		}
	}
	
	private class Node{
		E item;
		Node next; 
	}

}
