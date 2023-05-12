package DataStructures;

class TreeNode {
	TreeNode left, right;
	int val;

	public TreeNode(int val) {
		this.val = val;
	}
}

public class LCABST {

	public static TreeNode lowestcommonancestor(TreeNode root, int p, int q) {
		if(root == null) {
			return null;
		}
		if(root.val > p && root.val>q) {
			return lowestcommonancestor(root.left,p,q);
		}
		else if(root.val < p && root.val<q) {
			return lowestcommonancestor(root.right,p,q);
		}
		else {
			return root;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(6);
		 root.left = new TreeNode(2);
	        root.right = new TreeNode(8);
	        root.left.left = new TreeNode(0);
	        root.left.right = new TreeNode(4);
	        root.left.right.left = new TreeNode(3);
	        root.left.right.right = new TreeNode(5);
	        root.right.left = new TreeNode(7);
	        root.right.right = new TreeNode(9);
	       
	    
		int p = 4;
		int q = 7;
		
		TreeNode lca = lowestcommonancestor(root,p,q);
		System.out.println("LCA is : "+lca.val);

	}

}
