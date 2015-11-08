
public class StackTrack{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTrack s = new StackTrack();
		try{
			s.push(6);
			s.push(3);
			s.push(4);
			s.push(5);
			s.push(2);
			s.push(5);
			s.push(1);
			System.out.println(s.min());
			s.pop();
			System.out.println(s.min());
			s.pop();
			s.pop();
			System.out.println(s.min());
			s.pop();
			System.out.println(s.min());
			s.pop();
			System.out.println(s.min());
		}catch(Exception object){
			System.out.println(object);
		}
	}
	
	private Node top = null;
	private Node min = null;
	
	public void push(int item){
		Node oldNode = top;
		Node newNode = new Node();
		newNode.data= item;
		newNode.next = oldNode; 
		top = newNode;
		if(min != null){
			if(min.data > item){
				Node minN = new Node();
				minN.data = item;
				minN.next = min;
				min = minN;			
			}
		}else{
			Node randomNode = new Node();
			randomNode.data = item;
			randomNode.next = min;
			min = randomNode;
		}
	}
	
	public int pop() throws Exception{
		if(top == null){
			throw new Exception("Nothing to pop");
		}
		Node oldNode = top;
		top = oldNode.next;
		if(min != null){
			if(min.data >= oldNode.data){
				min = min.next;
			}
		}
		return oldNode.data;
	}
	
	public int min() throws Exception{
	
		if(min != null){
			return min.data;
		}else{
			throw new Exception("No min");
		}
	}
	
	private class Node{
		public int data;
		public Node next;
	}

}
