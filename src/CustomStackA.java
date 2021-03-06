
public class CustomStackA<Item> {
	private Item[] stack;
	private int N = 0;
	private int capacity; 
	public static void main(String[] args) {
		CustomStackA stack = new CustomStackA(10);
		stack.push("abcc");
		stack.push("ASDsad");
		stack.push("asdcc");
		stack.push("dasdDsad");
		stack.peek();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public CustomStackA(int capacity){
		stack = (Item[])new Object[capacity];
		capacity= this.capacity; 
	}
	
	public void push(Item a){
		stack[N++] =a;
	}
	
	public Item pop(){
		stack[N] = null;
		return stack[--N]; 	
	}
	
	public boolean isEmpty(){
		return N==0;
	}
	
	public boolean  isFull(){
		if(capacity <= N-1 ){
			return true; 
		}
		
		return false; 
	}
	
	public Item peek(){
		
		return stack[N -1];
	}
}
