import java.util.*;

//2017-2-15
public class FindBottomLeftTreeValue {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
    public int findBottomLeftValue(TreeNode root) {
    	List<List<Integer>> list = new ArrayList();
    	int height = -1;
    	help(root,height,list);
    	return list.get(list.size()-1).get(0);
    }
    public int help(TreeNode root,int height,List<List<Integer>> list){
    	if(root == null) return -1;
    	height++;
    	if(list.size() <= height) list.add(new ArrayList<Integer>());
    	list.get(height).add(root.val);
    	int n = help(root.left,height,list)+help(root.right,height,list);
    	return height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindBottomLeftTreeValue test = new FindBottomLeftTreeValue();
		TreeNode root = test.new TreeNode(3);
		TreeNode root1 = test.new TreeNode(9);
		TreeNode root2= test.new TreeNode(20);
		TreeNode root3 = test.new TreeNode(15);
		TreeNode root4 = test.new TreeNode(7);
		root.left = root1;
		root.right = root2;
		root2.left = root3;
		root2.right  = root4;
		int res = test.findBottomLeftValue(root);
		System.out.println(res);
	}

}
