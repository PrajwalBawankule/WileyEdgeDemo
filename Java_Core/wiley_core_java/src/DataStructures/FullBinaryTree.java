package DataStructures;

class NodeClass {
	int data;
	NodeClass leftChild, rightChild;

	public NodeClass(int item) {
		data = item;
		leftChild = rightChild = null;
	}
}

public class FullBinaryTree {
	NodeClass root;

	// Check for full binaryTree
	boolean isFullBinaryTree(NodeClass node) {

		// Checking tree emptiness
		if (node == null)
			return true;

		// Check the children
		if (node.leftChild == null && node.rightChild == null)
			return true;

		if ((node.leftChild != null) && (node.rightChild != null))
			return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));

		return false;
	}

	public static void main(String[] args) {
		FullBinaryTree tree = new FullBinaryTree();
		tree.root = new NodeClass(1);
		tree.root.leftChild = new NodeClass(2);
		tree.root.rightChild = new NodeClass(3);
		// tree.root.rightChild.leftChild = new NodeClass(9);
		tree.root.leftChild.leftChild = new NodeClass(4);
		tree.root.leftChild.rightChild = new NodeClass(5);
		tree.root.leftChild.rightChild.leftChild = new NodeClass(6);
		tree.root.leftChild.rightChild.rightChild = new NodeClass(7);

		if (tree.isFullBinaryTree(tree.root))
			System.out.println("The tree is a full binary tree");
		else
			System.out.println("The tree is not a full binary tree");
	}

}
