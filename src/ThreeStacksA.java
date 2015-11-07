import java.util.*; 
public class ThreeStacksA<Item> {
	
	int length;
	Node[] stack;
	Integer s1Top;
	Integer s2Top;
	Integer s3Top;
	int N =0;
	HashMap<Integer,Integer> stackMapping;
	
	public static void main(String[] args) {
		ThreeStacksA stack = new ThreeStacksA(100);
		stack.push(1, "adsadadad");
		stack.push(1, "bfd");
		stack.push(2, "hrth");
		stack.push(1, "bersdcsa");
		stack.push(3, "god bless");
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(2));
		System.out.println(stack.pop(3));
		System.out.println(stack.pop(3));
		System.out.println(stack.pop(1));
		stack.push(3, "new god bless");
		System.out.println(stack.pop(3));

	}

	public ThreeStacksA(int capacity){
		//Item[] stack = (Item[])new Object[capacity];
		//stack = (Node[])new Object[capacity];
		stack = new ThreeStacksA.Node[capacity];//new Object[capacity];
		stackMapping = new HashMap<Integer,Integer>();
		stackMapping.put(1,null);
		stackMapping.put(2,null);
		stackMapping.put(3,null);
	}
	
	public void push(int stackNumber, Item data){
		Node node = new Node();
		node.value = data;
		node.stack = stackNumber; 
		Integer stackposition = stackMapping.get(stackNumber);
		node.prevValue = stackposition;
		stackposition = N;
		stackMapping.put(stackNumber,stackposition);
		stack[N++] = node;
	}

	public Item pop(int stackNumber){
		Node popNode = null;
		Item value;
		//popNode.value = null; 
		Integer lastValue = stackMapping.get(stackNumber);
		if(lastValue != null){
			popNode = stack[lastValue];
			Integer prevIndex = popNode.prevValue;
			stackMapping.put(stackNumber, prevIndex);
			stack[lastValue] = null;
		}
		if(popNode == null){
			value = null;
		}else{
			value = popNode.value;
		}
		return value;
	}
	
	private class Node{
		Item value;
		int stack;
		Integer prevValue; 
	}
}
