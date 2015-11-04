
public class CustomLinkedListA<Item> {
	private Item[] stack;
	private int N = 0;
	public static void main(String[] args) {
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
