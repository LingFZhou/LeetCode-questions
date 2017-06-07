import java.util.*;
//2017-3-25
public class PopulatingNextRightPointersinEachNode {
	public class TreeLinkNode {
		 int val;
		 TreeLinkNode left, right, next;
		 TreeLinkNode(int x) { val = x; }
	}
//	  TreeLinkNode level_start=root;
//    while(level_start!=null){
//        TreeLinkNode cur=level_start;
//        while(cur!=null){
//            if(cur.left!=null) cur.left.next=cur.right;
//            if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;
//            
//            cur=cur.next;
//        }
//        level_start=level_start.left;
//    }
	
    public void connect(TreeLinkNode root) {
        List<List<TreeLinkNode>> list = new ArrayList<>();
        int height = helper(root,list,0);
        for(int i = 0; i < list.size(); i++){
        	list.get(i).add(null);
        }
        for(int i = 0; i < list.size(); i++){
        	for(int j = 0; j < list.get(i).size()-1; j++){
        		list.get(i).get(j).next = list.get(i).get(j+1);
        	}
        }
        List<List<Integer>> inte = new ArrayList<>();
        for(int i = 0; i < list.size();i++){
        	List<Integer> li = new ArrayList<>();
        	for(int j = 0; j < list.get(i).size();j++) 
        		if(list.get(i).get(j)!=null)li.add(list.get(i).get(j).val);
        	inte.add(li);
        }
        System.out.println(inte);
    }
    public int helper(TreeLinkNode root, List<List<TreeLinkNode>> list,int height){
    	if(root == null) return -1;
    	height = 1 + Math.max(helper(root.left,list,height),helper(root.right,list,height));
    	if(list.size()<=height){
    		List<TreeLinkNode> lis = new ArrayList<>();
    		list.add(lis);
    	}
    	list.get(height).add(root);
    	return height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopulatingNextRightPointersinEachNode test = new PopulatingNextRightPointersinEachNode();
		TreeLinkNode node = test.new TreeLinkNode(1);
		TreeLinkNode node2 = test.new TreeLinkNode(2);
		TreeLinkNode node3 = test.new TreeLinkNode(3);
		TreeLinkNode node4 = test.new TreeLinkNode(4);
		TreeLinkNode node5 = test.new TreeLinkNode(5);
		TreeLinkNode node6 = test.new TreeLinkNode(6);
		TreeLinkNode node7 = test.new TreeLinkNode(7);
		node.left = node2;
		node.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		test.connect(node);
		
	}

}
