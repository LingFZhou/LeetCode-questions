import java.util.*;
//2017-2-7
public class FindModeinBinarySearchTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
    public int[] findMode(TreeNode root) {
    	int[] r = new int[0];
    	if(root == null) return r;
        HashMap<Integer,Integer> result = new HashMap<>();
        helper(root,result);
        int len = result.keySet().size();
        int max = 0;
        List<Integer> keys = new ArrayList();
        List<Integer> values = new ArrayList();
        List<Integer> index = new ArrayList();
        for(int n : result.values()) values.add(n);
        for(int n : result.keySet()) keys.add(n);
        for(int i = 0; i < values.size(); i++){
        	if(values.get(i) >= max) max = values.get(i);
        }
        for(int i = 0; i < values.size(); i++){
        	if(values.get(i) == max) index.add(i);
        }
        int[] re = new int[index.size()];
        for(int i = 0; i < re.length; i++){
        	re[i] = keys.get(index.get(i));
        }
        return re;
        
    }
    public int helper(TreeNode root, HashMap<Integer,Integer> result){
    	result.put(root.val, result.getOrDefault(root.val, 0)+1);
    	if(root.left!=null&&root.right==null) return helper(root.left,result);
    	if(root.right!=null&&root.left==null) return helper(root.right,result);
    	if(root.right!=null&&root.left!=null) return helper(root.right,result) + helper(root.left,result);
    	return root.val;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindModeinBinarySearchTree test = new FindModeinBinarySearchTree();
		TreeNode t1 = test.new TreeNode(2);
		TreeNode t2 = test.new TreeNode(1);
		TreeNode t3 = test.new TreeNode(2);
		//TreeNode t4 = test.new TreeNode(2);
		//TreeNode t5 = test.new TreeNode(3);
		t1.left = t2;
		t1.left = t3;
		//t3.right = t4;
		//t4.right = t5;
		int[] r = test.findMode(t1);
		for(int i = 0; i < r.length; i++) System.out.println(r[i]);
	}

}
