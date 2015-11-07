
public class CustomLinkedListA<Item> {
	private Item[] stack;
	private int N = 0;
	
	public static void main(String[] args) {
		CustomLinkedListA stack = new CustomLinkedListA(10);
		stack.push("abcc");
		stack.push("ASDsad");
		stack.push("asdcc");
		stack.push("dasdDsad");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public CustomLinkedListA(int capacity){
		stack = (Item[])new Object[capacity];
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
}
