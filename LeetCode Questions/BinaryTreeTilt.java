import java.util.*;
//2017-4-22
public class BinaryTreeTilt {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public int findTilt(TreeNode root) {
    	List<Integer> list =  new ArrayList<>();
    	int m = tilt(root,list);
    	int res = 0;
    	for(int n:list) res+=n;
    	return res;
    }
    public int tilt(TreeNode root,List<Integer> list){
    	if(root==null) return 0;
    	int res = tilt(root.left,list)+tilt(root.right,list);
    	if(root.right!=null&&root.left==null){
    		root.val=root.val+root.right.val;
    		list.add(Math.abs(root.right.val));
    	}
    	else if(root.left!=null&&root.right==null){
    		root.val=root.val+root.left.val;
    		list.add(Math.abs(root.left.val));
    	}
    	else if(root.left!=null&&root.right!=null){
    		root.val=root.val+root.left.val+root.right.val;
    		list.add(Math.abs(root.left.val-root.right.val));
    	}
    	else if(root.left==null&&root.right==null) return 0;
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeTilt test = new BinaryTreeTilt();
		TreeNode root = test.new TreeNode(-8);
		TreeNode node1 = test.new TreeNode(3);
		TreeNode node2 = test.new TreeNode(0);
		TreeNode node3 = test.new TreeNode(-8);
		TreeNode node4 = test.new TreeNode(-1);
		TreeNode node5 = test.new TreeNode(8);
		//TreeNode node6 = test.new TreeNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node3.right=node4;
		node4.right = node5;
		//node2.right = node6;
		
		int res = test.findTilt(root);
		System.out.println(res);
		
	}

}
