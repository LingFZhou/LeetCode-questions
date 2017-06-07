import java.util.*;

public class SymmetricTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
	//recursive
//	public boolean isSymmetric(TreeNode root) {
//	    return root==null || isSymmetricHelp(root.left, root.right);
//	}
//
//	private boolean isSymmetricHelp(TreeNode left, TreeNode right){
//	    if(left==null || right==null)
//	        return left==right;
//	    if(left.val!=right.val)
//	        return false;
//	    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
//	}
	
	//iteration
//	  if(root==null)  return true;
//    
//    Stack<TreeNode> stack = new Stack<TreeNode>();
//    TreeNode left, right;
//    if(root.left!=null){
//        if(root.right==null) return false;
//        stack.push(root.left);
//        stack.push(root.right);
//    }
//    else if(root.right!=null){
//        return false;
//    }
//        
//    while(!stack.empty()){
//        if(stack.size()%2!=0)   return false;
//        right = stack.pop();
//        left = stack.pop();
//        if(right.val!=left.val) return false;
//        
//        if(left.left!=null){
//            if(right.right==null)   return false;
//            stack.push(left.left);
//            stack.push(right.right);
//        }
//        else if(right.right!=null){
//            return false;
//        }
//            
//        if(left.right!=null){
//            if(right.left==null)   return false;
//            stack.push(left.right);
//            stack.push(right.left);
//        }
//        else if(right.left!=null){
//            return false;
//        }
//    }
//    
//    return true;
	public boolean isSymmetric(TreeNode root) {
		List<List<Integer>> list = new ArrayList();
		int height = -1;
		helper(root,list,height);
		System.out.println(list);
		for(int i = 0; i < list.size();i++){
			for(int j = 0; j < list.get(i).size(); j++){
				if(list.get(i).get(j)!=list.get(i).get(list.get(i).size()-1-j)) return false;
			}
		}
		return true;
    }
	public int helper(TreeNode root, List<List<Integer>> list, int height){
		height++;
		if(list.size()<=height) list.add(new ArrayList<Integer>());
		if(root==null) {
			list.get(height).add(null);
			return height;
		}
		else list.get(height).add(root.val);
		int n = helper(root.left, list, height) + helper(root.right, list, height);
		return height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymmetricTree test = new SymmetricTree();
		TreeNode root = test.new TreeNode(3);
		TreeNode root1 = test.new TreeNode(4);
		TreeNode root2 = test.new TreeNode(4);
		TreeNode root3 = test.new TreeNode(0);
//		TreeNode root4 = test.new TreeNode(1);
//		TreeNode root5 = test.new TreeNode(0);
//		TreeNode root6 = test.new TreeNode(1);
		root.left = root1;
		root.right = root2;
		
		root1.left = root3;
		//root1.right = root4;
		//root2.right  = root5;
		//root2.left = root6;
		boolean flag = test.isSymmetric(root);
		System.out.println(flag);
		
	}

}
