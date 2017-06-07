import java.util.*;
//2017-4-22
public class PathSumII {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> list = new ArrayList<>();
    	List<Integer> lis = new ArrayList<>();
    	helper(list,lis,root,sum,0);
    	return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> lis,
    		TreeNode root,int sum, int cur){
    	if(root==null) return;
    	cur+=root.val;
    	lis.add(root.val);
    	if(cur==sum&&root.left==null&&root.right==null) {
    		list.add(lis);
    		return;
    	}
    	helper(list,new ArrayList(lis),root.left,sum,cur);
    	helper(list,new ArrayList(lis),root.right,sum,cur);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathSumII test = new PathSumII();
		TreeNode root = test.new TreeNode(5);
		TreeNode node1 = test.new TreeNode(4);
		TreeNode node2 = test.new TreeNode(8);
		TreeNode node3 = test.new TreeNode(11);
		TreeNode node4 = test.new TreeNode(13);
		TreeNode node5 = test.new TreeNode(4);
		TreeNode node6 = test.new TreeNode(7);
		TreeNode node7 = test.new TreeNode(2);
		TreeNode node8 = test.new TreeNode(5);
		TreeNode node9 = test.new TreeNode(1);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node3.left = node6;
		node3.right = node7;
		node2.left = node4;
		node2.right = node5;
		node5.left = node8;
		node5.right = node9;
		
		List<List<Integer>> list = test.pathSum(root, 22);
		System.out.println(list);
		
		
	}

}
