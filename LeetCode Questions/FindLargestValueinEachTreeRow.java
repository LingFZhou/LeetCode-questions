import java.util.*;
//2017-3-1
public class FindLargestValueinEachTreeRow {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public List<Integer> largestValues(TreeNode root) {
        int height = -1;
        List<List<Integer>> list = new ArrayList();
        List<Integer> res = new ArrayList();
        int n = help(root,list,height);
        for(List lis : list){
        	int curmax = Integer.MIN_VALUE;
        	for(int i = 0; i <lis.size();i++){
        		curmax = Math.max(curmax, (int) lis.get(i));
        	}
        	res.add(curmax);
        }
        return res;
    }
    public int help(TreeNode root, List<List<Integer>> list,int height){
    	if(root == null) return -1;
    	height++;
    	if(list.size()<=height) list.add(new ArrayList<Integer>());
    	list.get(height).add(root.val);
    	int m = help(root.left,list,height) + help(root.right,list,height);
    	return height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLargestValueinEachTreeRow test = new FindLargestValueinEachTreeRow();
		TreeNode root = test.new TreeNode(1);
		TreeNode root1 = test.new TreeNode(3);
		TreeNode root2 = test.new TreeNode(2);
		TreeNode root3 = test.new TreeNode(5);
		TreeNode root4 = test.new TreeNode(3);
		TreeNode root5 = test.new TreeNode(9);
		root.left = root1;
		root.right = root2;
		root1.left = root3;
		root1.right = root4;
		root2.right = root5;
		List<Integer> res = test.largestValues(root);
		System.out.println(res);
		
		
	}

}
