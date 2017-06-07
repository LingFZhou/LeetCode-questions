import java.util.*;
//2017-2-14
public class BinaryTreeLevelOrderTraversalII {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> list = new ArrayList();
    	int height = -1;
    	helper(root,list,height);
    	for(int i = 0; i < list.size()/2; i++){
    		int j = list.size() - i - 1;
    		List<Integer> temp = list.get(i);
    		list.set(i, list.get(j));
    		list.set(j, temp);
    	}
    	return list;
    }
    public int helper(TreeNode root, List<List<Integer>> list,int height){
    	if(root == null) return -1;
    	height++;
    	if(list.size()<=height) {
    		List<Integer> lis = new ArrayList();
    		list.add(lis);
    	}
    	list.get(height).add(root.val);
    	int n = helper(root.left,list,height)+helper(root.right,list,height);
    	return height;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeLevelOrderTraversalII test = new BinaryTreeLevelOrderTraversalII();
		TreeNode root = test.new TreeNode(3);
		TreeNode root1 = test.new TreeNode(9);
		TreeNode root2= test.new TreeNode(20);
		TreeNode root3 = test.new TreeNode(15);
		TreeNode root4 = test.new TreeNode(7);
		root.left = root1;
		root.right = root2;
		root2.left = root3;
		root2.right  = root4;
		List<List<Integer>> list = test.levelOrderBottom(root);
		System.out.println(list);
	}

}
