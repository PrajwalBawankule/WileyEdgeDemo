package DataStructures;

//Binary search tree operations
public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	static Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Check whether tree is empty
		if (root == null) {
			root = newNode;
			return;
		} else {
			// current node point to root of the tree
			Node current = root, parent = null;

			while (true) {
				
				parent = current;

				if (data < current.key) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}
				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	boolean search(Node root, int x) {
		if (root == null) {
			return false;
		}
		if (root.key == x)
			return true;

		if (root.key > x) {
			System.out.println(root.key);
			return search(root.left, x);
		}
		System.out.println(root.key);
		return search(root.right, x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(10);
		bst.insert(2);
		bst.insert(5);
		bst.insert(11);
		
		if(bst.search(root,5)){
			System.out.println("Node present");
		}
		
//		bst.root = new Node(8);
//		bst.root.left = new Node(3);
//		bst.root.left.left = new Node(1);
//		bst.root.left.right = new Node(6);
//		bst.root.left.right.left = new Node(6);

	}

}
