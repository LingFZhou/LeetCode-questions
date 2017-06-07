import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightPointersinEachNodeII {
	public class TreeLinkNode {
		 int val;
		 TreeLinkNode left, right, next;
		 TreeLinkNode(int x) { val = x; }
	}
	
	
   public void connect(TreeLinkNode root) {
//	   TreeLinkNode head = null; //head of the next level
//       TreeLinkNode prev = null; //the leading node on the next level
//       TreeLinkNode cur = root;  //current node of current level
//       while (cur != null) {
//           
//           while (cur != null) { //iterate on the current level
//               //left child
//               if (cur.left != null) {
//                   if (prev != null) {
//                       prev.next = cur.left;
//                   } else {
//                       head = cur.left;
//                   }
//                   prev = cur.left;
//               }
//               //right child
//               if (cur.right != null) {
//                   if (prev != null) {
//                       prev.next = cur.right;
//                   } else {
//                       head = cur.right;
//                   }
//                   prev = cur.right;
//               }
//               //move to next node
//               cur = cur.next;
//           }
//           
//           //move to next level
//           cur = head;
//           head = null;
//           prev = null;
//       }
		
       List<List<TreeLinkNode>> list = new ArrayList<>();
       int height = helper(root,list,-1);
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
   	height++;
   	if(list.size()<=height){
   		List<TreeLinkNode> lis = new ArrayList<>();
   		list.add(lis);
   	}
   	list.get(height).add(root);
   	int m = helper(root.left,list,height)+helper(root.right,list,height);
   	return m;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopulatingNextRightPointersinEachNodeII test = new PopulatingNextRightPointersinEachNodeII();
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
		//node3.left = node6;
		node3.right = node7;
		test.connect(node);
	}

}
