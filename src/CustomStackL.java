
public class CustomStackL <Item>{
	
	Node top = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStackL<String> stack = new CustomStackL<String>();
		stack.push("abc");
		stack.push("eretr");
		stack.push("dsadasd");
		stack.push("adas");
		stack.push("gffd");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	
	public CustomStackL(){
		
	}
	
	public void push(Item data){
		Node oldNode = top;
		top  = new Node();
		top.data = data;
		top.Next =oldNode;
	}
	
	public Item pop(){
		if(top == null){
			return null;
		}
		Item popData = top.data;
		top = top.Next;
		return popData;
	
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	private class Node{
		public Node Next;
		public Item data;
	}
}
