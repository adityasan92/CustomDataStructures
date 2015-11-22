
public class BinarySearchTree {

	private Node rootNode; 
	
	public static void main(String[] args){
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(12,"Hello World");
		bt.insert(6,"I am god");
		bt.insert(16,"New World");
		bt.insert(3,"ok game");
		bt.insert(5,"game");
		bt.insert(4,"four");
		bt.insert(2,"four");
		//Node rootNode = bt.getRoot();
		//String searchValue = bt.findParent(15);
		int succesor = bt.findSuccesor(6);
		System.out.println(succesor);
		bt.postOrder();
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
			root.rightChild.parent = root;  
			//System.out.println(news.value);
		}else if(root.key > key){
			root.leftChild = insertR(root.leftChild,key,value);	
			root.leftChild.parent = root;  
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
		return search(key, rootNode).value;
	}
	
	public String findParent(int key){
		return searchR(key, rootNode).parent.value;
	}
	
	public Node search(int key,Node node){
		
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
	
	public int findSuccesor(int key){
		
		Node tempNode = searchR(key, rootNode); 
		if(tempNode.rightChild != null){
			return findMin(tempNode.rightChild).key;
		}else{
			Node parent = tempNode.parent;
			while(parent != null){
				if(parent.leftChild == tempNode){
					return parent.key; 
				}
				tempNode = parent;
				parent = parent.parent; 
			}
			return -1; 
		}
	
	}
	
	public Node findMin(Node node){
		
		while(node.leftChild != null){
			node = node.leftChild; 
		}
		return node; 
	}
	
	public Node findMinR(Node node){
		
		if(node.leftChild == null){
			findMinR(node.leftChild); 
		}
		return node; 
	}
	
	public int findSuccesor(int key, Node node){
		
		if(node.rightChild != null){
			Node rightTree = node.rightChild ; 
			
		}

		
		return 0; 
	}
	
	
	public Node getRoot(){
		return rootNode; 
	}
	
	/*public boolean isBst(){
		
		return isBst(rootNode);
	}
	
	private boolean isBst(Node root){
		
		if(root.rightChild == null){
			return root;
		}
		
	}*/
	
	public void inOrder(){
		inOrder(rootNode);
	}
	
	private Node inOrder(Node node){
		
		if(node == null){
			return node; 
		}
		inOrder(node.leftChild);
		System.out.println(node.key);
		inOrder(node.rightChild);
		return node; 
	}
	
	public void preOrder(){
		preOrder(rootNode);
	}
	
	private Node preOrder(Node node){
		
		if(node == null){
			return node; 
		}
		System.out.println(node.key);
		preOrder(node.leftChild);
		preOrder(node.rightChild);
		return node; 
	}
	
	public void postOrder(){
		postOrder(rootNode);
	}
	
	private Node postOrder(Node node){
		
		if(node == null){
			return node; 
		}
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.println(node.key);
		return node; 
	}
	
	private class Node{
		public int key; 
		public Node leftChild;
		public Node rightChild;
		public Node parent; 
		public String value; 
	}
}
