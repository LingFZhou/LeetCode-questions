import java.util.*;
//2017-2-5
public class FindLeavesofBinaryTree {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public List<List<Integer>> findLeaves(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		GetHeight(root,list);
		return list;
    }
	public int GetHeight(TreeNode root, List<List<Integer>> list){
		if(root==null) return -1;
		int height = 1 + Math.max(GetHeight(root.left,list),GetHeight(root.right,list));
		if(list.size()<height+1) list.add(new ArrayList<Integer>());
		list.get(height).add(root.val);
		return height;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLeavesofBinaryTree test  = new FindLeavesofBinaryTree();
		TreeNode node1 = test.new TreeNode(1);
		TreeNode node2 = test.new TreeNode(2);
		TreeNode node3 = test.new TreeNode(3);
		TreeNode node4 = test.new TreeNode(4);
		TreeNode node5 = test.new TreeNode(5);
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		node4.left = node5;
		List<List<Integer>> re = test.findLeaves(node1);
		for(List<Integer> li : re) System.out.println(li);
	
		
	}

}
