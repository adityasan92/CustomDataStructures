import java.util.*; 
public class SetOfStacks<Item> {
	
	ArrayList<CustomStackA<Item>> stacks = new ArrayList<CustomStackA<Item>>();
	int top = 0; 
	public void push(Item item){
		CustomStackA<Item> last = stacks.get(top);
		Item topElement = last.peek();		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
