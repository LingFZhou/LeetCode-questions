import java.util.*;
//2017-4-6
public class FlattenBinaryTreetoLinkedList {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
