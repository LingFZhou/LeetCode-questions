import java.util.Stack;
//2017-3-11
public class KthSmallestElementinaBST {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
//	  int count = countNodes(root.left);
//    if (k <= count) {
//        return kthSmallest(root.left, k);
//    } else if (k > count + 1) {
//        return kthSmallest(root.right, k-1-count); // 1 is counted as current node
//    }
    
//    return root.val;
    public int kthSmallest(TreeNode root, int k) {
    	Stack<Integer> st = new Stack<>();
    	int m = helper(root,st);
    	for(int i = 0; i < k-1; i++) st.pop();
    	return st.pop();
    }
    public int helper(TreeNode root, Stack<Integer> st){
    	if(root == null) return 0;
    	int n1 = helper(root.right,st);
    	st.push(root.val);
    	int n2 = helper(root.left,st);
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestElementinaBST test = new KthSmallestElementinaBST();
		TreeNode root = test.new TreeNode(3);
		TreeNode left1 = test.new TreeNode(1);
		TreeNode right1 = test.new TreeNode(4);
		root.left = left1;
		root.right = right1;
		TreeNode left2 = test.new TreeNode(2);
		TreeNode right2 = test.new TreeNode(7);
		left1.right = left2;
		right1.right = right2;
		int res = test.kthSmallest(root, 4);
		System.out.println(res);
		
	}

}
