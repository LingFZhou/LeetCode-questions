import java.util.*;
//2017-3-25
public class BoundaryofBinaryTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
    	
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        List<List<Integer>> leaveslist = new ArrayList<>();
        List<Integer> leavesbound = new ArrayList<>();
        List<Integer> leftbound = new ArrayList<>();
        leftbound.add(root.val);
        List<Integer> rightbound = new ArrayList<>();
        rightbound.add(root.val);
        
        int height = leaves(root,leaveslist,0);
        leavesbound = leaveslist.get(0);
        if(root.left!=null){
        	int left = leftboundary(root,leftbound);
        }
        
        if(root.right!=null){
        	int right = rightboundary(root,rightbound);
        }
        if(root.left==null&&root.right==null) return leftbound;
        for(int i = 0; i < leftbound.size();i++) list.add(leftbound.get(i));
        //int m = leftbound.get(leftbound.size()-1)==leavesbound.get(0)?1:0;
        int m = root.left==null?0:1;
        for(; m < leavesbound.size(); m++) list.add(leavesbound.get(m));
        //int n = rightbound.get(rightbound.size()-1)==leavesbound.get(leavesbound.size()-1)?
        		//rightbound.size()-2:rightbound.size()-1;
        int n = root.right == null?rightbound.size()-1:rightbound.size()-2;
        for(; n > 0; n--) list.add(rightbound.get(n));
        System.out.println(leftbound);
        System.out.println(leavesbound);
        System.out.println(rightbound);
        System.out.println(list);
        return list;
    }
    public int leaves(TreeNode root, List<List<Integer>> list, int height){
    	if(root == null) return -1;
    	height = 1+Math.max(leaves(root.left,list,height),leaves(root.right,list,height));
    	if(list.size()<=height){
    		List<Integer> lis = new ArrayList<>();
    		list.add(lis);
    	}
    	list.get(height).add(root.val);
    	return height;
    }
    public int leftboundary(TreeNode root, List<Integer> list){
    	if(root==null) return 0;
    	if(root.left !=null) {
    		list.add(root.left.val);
    		return leftboundary(root.left,list);
    	}
    	else if(root.left==null&&root.right!=null){
    		list.add(root.right.val);
    		return leftboundary(root.right,list);
    	}
    	else return 0;
    	
    }
    public int rightboundary(TreeNode root, List<Integer> list){
    	if(root==null) return 0;
    	if(root.right !=null) {
    		list.add(root.right.val);
    		return rightboundary(root.right,list);
    	}
    	else if(root.right==null&&root.left!=null){
    		list.add(root.left.val);
    		return rightboundary(root.left,list);
    	}
    	else return 0;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		BoundaryofBinaryTree test = new BoundaryofBinaryTree();
		List<TreeNode> li = new ArrayList<>();
		for(int i = 0; i < 1; i++){
			TreeNode node = test.new TreeNode(0);
			li.add(node);
		}
		List<Integer> res = test.boundaryOfBinaryTree(li.get(0));
		System.out.println(res);
		
		
	}

}
