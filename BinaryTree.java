package DataStructures;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BinaryTree {
private TreeNode root;
	
	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data; // Can be any generic type
		
		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void preOrder() {
		if(root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(8);
		TreeNode fourth = new TreeNode(4);
	    TreeNode fifth = new TreeNode(5);
	    TreeNode sixth = new TreeNode(6);
	    
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		
	
	
	}
//public void inorder(TreeNode root) {
//	if(root==null) {
//		return;
//	}
//	inorder(root.left);
	//System.out.println(root.data+" ");
	//inorder(root.right);
//}
public void inorder(TreeNode root) {
	if(root == null) {
		return;
	}
	Stack<TreeNode> stack = new Stack<>();
	TreeNode temp = root;
	while(!stack.isEmpty() || temp!=null) {
		if(temp!=null) {
			stack.push(temp);
			temp=temp.left;
			
		}else {
			temp= stack.pop();
			System.out.println(temp.data+" ");
			temp = temp.right;
		}
	}
		
	}
public void postorder(TreeNode root) {
	
	if(root==null) {
		return;
	}
	postorder(root.left);
	postorder(root.right);
	System.out.println(root.data +" ");
}
public void postorder() {
	TreeNode current = root;
	Stack <TreeNode> stack = new Stack<>();
			
	while (current!= null || !stack.isEmpty()) {
		if(current!=null) {
			stack.push(current);
			current = current.left;
		}else {
			TreeNode temp = stack.peek().right;
			if(temp==null) {
				temp = stack.pop();
				System.out.println(temp.data + "");
				while(!stack.isEmpty() && temp == stack.peek().right){
					temp =stack.pop();
					System.out.println(temp.data +"  ");
							
				}		 
			}else {
				current = temp;
			}
			}
         }
	}
public void levelorder() {
	if(root==null){
		return;
	}
	Queue <TreeNode> queue = new LinkedList<>();
	queue.offer(root);
	while(!queue.isEmpty()) {
		TreeNode temp = queue.poll();
		System.out.println(temp.data+" ");
		if(temp.left != null) {
			queue.offer(temp.left);
		}
		if(temp.right != null) {
			queue.offer(temp.right);
		}
	}
}
public int findmax() {
	return findmax(root);
	
}
public int findmax(TreeNode root) {
	if(root ==null) {
		return Integer.MIN_VALUE;
	}
	int result = root.data;
	int left = findmax(root.left);
	int right = findmax(root.right);
	
	if(left>result) {
		result= left;
	}
	if(right>result) {
		result = right;
	}
	return result;
}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
   //    bt.inorder(bt.root);
	//}
  // bt.inorder(bt.root);
	//	bt.postorder(bt.root);
		//bt.postorder();
		//bt.levelorder();
		System.out.println(bt.findmax());
}
}
