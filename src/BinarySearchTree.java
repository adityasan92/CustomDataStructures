
public class BinarySearchTree {

	private Node rootNode; 
	
	public static void main(String[] args){
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(10,"Hello World");
		bt.insert(15,"I am god");
		bt.insert(1,"New World");
		bt.insert(4,"game");
		bt.insert(3,"game");
		//Node rootNode = bt.getRoot();
		String searchValue = bt.find(15);
		System.out.println(searchValue);
	}
	
	public Node insertR(Node root, int key, String value){
		Node news; 
		if(root == null){
			root = new Node();
			root.key= key;
			root.value = value;
			return root; 
			//rootNode = root; 
			//System.out.println(rootNode.value);
		}
		if(root.key <key){	
			root.rightChild = insertR(root.rightChild,key,value);
			//System.out.println(news.value);
		}else if(root.key > key){
			root.leftChild = insertR(root.leftChild,key,value);	
			//System.out.println(news.value);
		}else{
			root.value = value; 
		}
		return root; 
	}
	
	public void insert(int key, String value){
		rootNode = insertR(rootNode, key, value);
		//System.out.println(rootNode.value);
	}
	
	public Node searchR(int Key,Node node){
		
		if(node == null || node.key == Key){ 
			return node;	
		}else if(node.key < Key){
			return searchR(Key,node.rightChild);
		}else{
			return searchR(Key,node.leftChild);
		}
	}
	
	public String find(int key){
		return searchR(key, rootNode).value;
	}
	
	public Node search(Node node, int key){
		
		Node currentNode = node;
		
		if(node == null){
			return node; 
		}
		
		while(currentNode != null){
			if(currentNode.key == key){
				return currentNode;
			}
			else if(node.key < key){
				currentNode = currentNode.rightChild;
			}
			else{
				currentNode = currentNode.leftChild;
			}
		}
		return null; 
	}
	
	public Node getRoot(){
		return rootNode; 
	}
	private class Node{
		public int key; 
		public Node leftChild;
		public Node rightChild;
		public Node parent; 
		public String value; 
	}
}
