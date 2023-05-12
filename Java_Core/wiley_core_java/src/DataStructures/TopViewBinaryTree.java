package DataStructures;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
	Node left,right;
	int data;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class TopViewBinaryTree {

	Node root;
	public TopViewBinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopViewBinaryTree tree = new TopViewBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.left.right.right = new Node(5);
		tree.root.left.right.right.right = new Node(6);
		
		tree.TopView(tree.root);
		
	}

	private void TopView(Node root) {
		// TODO Auto-generated method stub
		class QueueObj{
			Node node;
			int hd;
	
		QueueObj(Node node,int hd){
			this.node = node;
			this.hd = hd;
		}
	  }	
		
	Queue<QueueObj> q = new LinkedList<QueueObj>();
	Map<Integer,Node> topViewMap = new TreeMap<Integer,Node>();
	
	if(root == null) {
		return;
	}
	else {
		q.add(new QueueObj(root,0));
	}
	
	System.out.println("Top View is :");
	
	while(!q.isEmpty()) {
		QueueObj tmpNode = q.poll();
		if(!topViewMap.containsKey(tmpNode.hd)) {
			topViewMap.put(tmpNode.hd, tmpNode.node);
		}
		
		if(tmpNode.node.left != null) {
			q.add(new QueueObj(tmpNode.node.left,tmpNode.hd-1));
			
		}
		if(tmpNode.node.left != null) {
			q.add(new QueueObj(tmpNode.node.right,tmpNode.hd+1));
		}
	}
	for(Map.Entry<Integer,Node> entry : topViewMap.entrySet()) {
		System.out.println(entry.getValue().data+" ");
	}
	
	}

}
