import java.util.Stack;
//2017-3-18
public class DiameterofBinaryTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public int diameterOfBinaryTree(TreeNode root) {
        int curmax = 0;
        Stack<TreeNode> st = new Stack<>();
        instack(root,st);
        while(!st.empty()){
        	TreeNode tr = st.pop();
        	curmax = Math.max(curmax, helper(tr)+helper2(tr));
        }
        return curmax;
    }
    public int helper(TreeNode root){
    	if(root == null) return -1;
    	int height = 1+Math.max(helper(root.left),helper(root.right));
    	return height;
    }
    public int helper2(TreeNode root){
    	if(root == null) return -1;
    	int height = 1+Math.min(helper(root.left),helper(root.right));
    	return height;
    }
    public void instack(TreeNode root, Stack<TreeNode> st){
    	if(root == null) return;
    	st.push(root);
    	instack(root.left,st);
    	instack(root.right,st);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiameterofBinaryTree test = new DiameterofBinaryTree();
		TreeNode root = test.new TreeNode(1);
		TreeNode node1 = test.new TreeNode(2);
		TreeNode node2 = test.new TreeNode(3);
		TreeNode node3 = test.new TreeNode(4);
		TreeNode node4 = test.new TreeNode(5);
		TreeNode node5 = test.new TreeNode(5);
		TreeNode node6 = test.new TreeNode(5);
		TreeNode node7 = test.new TreeNode(5);
		TreeNode node8 = test.new TreeNode(5);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node3.left = node5;
		node4.right = node6;
		node5.left = node7;
		node6.right = node8;
		int res = test.diameterOfBinaryTree(root);
		System.out.println(res);
		
	}

}
