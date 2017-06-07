import java.util.*;
//2017-2-2
public class BinaryTreePaths { 
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root != null) spath(root,"",list);
        return list;
    }
	public void spath(TreeNode root, String path, List<String> r){
		if(root.left == null && root.right == null) r.add(path + root.val);
		if(root.left != null) spath(root.left, path + root.val + "->", r);
		if(root.right != null) spath(root.right, path + root.val + "->", r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
