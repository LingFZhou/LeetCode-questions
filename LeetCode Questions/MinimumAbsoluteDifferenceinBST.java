import java.util.ArrayList;

public class MinimumAbsoluteDifferenceinBST {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        int he = helper(root,list);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size()-1;i++){
        	for(int j = i+1; j < list.size();j++){
        		int dif = Math.abs(list.get(i)-list.get(j));
        		min = dif > min?min:dif;
        	}
        }
        return min;
    }
    public int helper(TreeNode root, ArrayList<Integer> lis){
    	if(root == null) return 0;
    	if(root!=null) lis.add(root.val);
    	return helper(root.left, lis)+helper(root.right,lis);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumAbsoluteDifferenceinBST test = new MinimumAbsoluteDifferenceinBST();
		TreeNode root = test.new TreeNode(1);
		TreeNode root1 = test.new TreeNode(2);
		TreeNode root2 = test.new TreeNode(3);
		root.right = root1;
		root1.left = root2;
		int res = test.getMinimumDifference(root);
		System.out.println(res);
		
	}

}
