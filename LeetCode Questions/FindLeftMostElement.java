import java.util.*;
//2017-2-11
public class FindLeftMostElement {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
    public int findLeftMostNode(TreeNode root) {
    	List<TreeNode> list = new LinkedList<>();
        list.add(root);
        Integer res = null;
        while(list.size()>0){
            List<TreeNode> next = new LinkedList<>();
            int size = list.size(); 
            for(int i = 0; i<size; i++){
                TreeNode cur = list.get(i);
                if(i==0) res = cur.val; 
                if(cur.left!=null) next.add(cur.left);
                if(cur.right!=null) next.add(cur.right);
            }
            list = next;
        }
        return res;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLeftMostElement test = new FindLeftMostElement();
		TreeNode root = test.new TreeNode(4);
		root.right = test.new TreeNode(5);
		root.left = test.new TreeNode(8);
		root.right.right = test.new TreeNode(10);
		int n = test.findLeftMostNode(root);
		System.out.println(n);
	}

}
