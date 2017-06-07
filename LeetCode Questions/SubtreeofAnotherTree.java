//2017-5-6
public class SubtreeofAnotherTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	if(s==null||t==null) return false;
    	else{
    		if(same(s,t)) return true;
    		else return isSubtree(s.left,t)||isSubtree(s.right,t);
    	}
    	
    }
    public boolean same(TreeNode s, TreeNode t){
    	if(s==null&&t==null) return true;
    	if(s==null&&t!=null) return false;
    	if(s!=null&&t==null) return false;
    	else{
    		if(s.val==t.val){
    			if(same(s.left,t.left)&&same(s.right,t.right)) return true;
    		}
    	}
    	return false;
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtreeofAnotherTree test = new SubtreeofAnotherTree();
		TreeNode s = test.new TreeNode(3);
		TreeNode sl = test.new TreeNode(4);
		TreeNode sr = test.new TreeNode(5);
		TreeNode sll = test.new TreeNode(1);
		TreeNode slr = test.new TreeNode(2);
		TreeNode slrl = test.new TreeNode(0);
		slr.left = slrl;
		TreeNode t = test.new TreeNode(4);
		TreeNode tl = test.new TreeNode(1);
		TreeNode tr = test.new TreeNode(2);
		s.left = sl;
		s.right = sr;
		sl.left = sll;
		sl.right = slr;
		t.left = tl;
		t.right = tr;
		System.out.println(test.isSubtree(s,t));

	}

}
