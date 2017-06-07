import java.util.*;
//2017-3-3
public class MostFrequentSubtreeSum {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public int[] findFrequentTreeSum(TreeNode root) {
    	
    	HashMap<Integer,Integer> map = new HashMap();
        int m = helper(root,map);
        int[] index = new int[map.size()];
        int[] keys = new int[map.size()];
        int count = 0;
        int count1 = 0;
        for(Integer i:map.values())	index[count++] = i;
        for(Integer i:map.keySet()) keys[count1++] = i;
        for(int i = index.length-1; i >0; i--){
        	for(int j = 0; j < i;j++){
        		if(index[j]<index[j+1]){
        			int temp = index[j];
        			index[j] = index[j+1];
        			index[j+1] = temp;
        			int temp1 = keys[j];
        			keys[j] = keys[j+1];
        			keys[j+1] = temp1;
        		}
        	}
        }
        int len = 1;
        for(int i = 0; i < index.length-1; i++){
        	if(index[i] == index[i+1])  len++;
        	else if(index[i] != index[i+1]) break;
        }
        
        int[] res = new int[len];
        if(root == null) return new int[0];
        for(int i = 0; i < res.length; i++) {res[i] = keys[i]; System.out.println(res[i]);}
        return res;
    }
    public int helper(TreeNode root, HashMap<Integer,Integer> map){
    	if(root == null) return 0;
    	int m = root.val + helper(root.left, map) + helper(root.right,map);
    	map.put(m, map.getOrDefault(m,0)+1);
    	return m;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostFrequentSubtreeSum test = new MostFrequentSubtreeSum();
		TreeNode root = test.new TreeNode(5);
		TreeNode root1 = test.new TreeNode(2);
		TreeNode root2 = test.new TreeNode(-5);
		root.left = root1;
		root.right = root2;
		int[] res = test.findFrequentTreeSum(root);
		
	}

}
