//2017-2-7
public class ConvertSortedArraytoBinarySearchTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
        int i = 0; 
        int j = nums.length-1;
        TreeNode root = new TreeNode(0);
        helper(i,j,nums,root);
        return root;
    }
	public int helper(int i, int j, int[] nums, TreeNode root){
		if(i == j) {
			root.val = nums[(i+j)/2];
			return nums[i];
		}
		root.val = nums[(i+j)/2];
		if(j-i==1){
			TreeNode ri = new TreeNode(0);
			root.right = ri;
			helper((i+j)/2+1,j,nums,ri);
		}
		if(j-i>1){
			TreeNode le = new TreeNode(0);
			root.left = le;
			TreeNode ri = new TreeNode(0);
			root.right = ri;
			helper(i,(i+j)/2-1,nums,le);
			helper((i+j)/2+1,j,nums,ri);
		}
		return nums[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertSortedArraytoBinarySearchTree test = new ConvertSortedArraytoBinarySearchTree();
		int[] nums = {5,6,7,8};
		TreeNode t1 = test.sortedArrayToBST(nums);
		System.out.println(t1.val);
		
	}

}
