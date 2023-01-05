// Given a binary tree, find its minimum depth. The minimum depth is the 
// number of nodes along the shortest path from the root node down to the nearest leaf node. 
// For example, minimum height of below Binary Tree is 2. 
//   1
//  / \
//  2  3
//  /\
// 4 5

class MinDepthInBinaryTree {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class MinimumTreeHeight {
	Node root;

	int minimumDepth() { return minimumDepth(root, 0); }

	int minimumDepth(Node root, int level) {

		if (root == null)
			return level;
		level++;

		return Math.min(minimumDepth(root.left, level), minimumDepth(root.right, level));
	}
	public static void main(String args[]) {
		MinimumTreeHeight tree = new MinimumTreeHeight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("The minimum depth of " + "binary tree is : " + tree.minimumDepth());
	}
}
