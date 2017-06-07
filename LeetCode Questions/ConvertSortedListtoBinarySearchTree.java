import java.util.*;

public class ConvertSortedListtoBinarySearchTree {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public TreeNode sortedListToBST(ListNode head) {
    	int len = 0;
    	List<ListNode> list = new ArrayList<>();
    	ListNode t = head;
        while(t!=null){
        	len++;
        	list.add(t);
        	t = t.next;
        	
        }
        TreeNode res = helper(list,1,len);
        return res;
        
    }
    public TreeNode helper(List<ListNode> list, int start, int end){
    	if(start>end) return null;
    	int mid = start + (end - start)/2;
    	TreeNode left = helper(list, start, mid-1);
    	TreeNode root = new TreeNode(list.get(0).val);
    	root.left = left;
    	list.remove(0);
    	root.right = helper(list,mid+1,end);
    	return root;
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertSortedListtoBinarySearchTree test = new ConvertSortedListtoBinarySearchTree();
		ListNode head = test.new ListNode(3);
		ListNode node1 = test.new ListNode(5);
		ListNode node2 = test.new ListNode(8);
		head.next = node1;
		node1.next = node2;
		//ListNode node3 = test.new ListNode(0);
		test.sortedListToBST(head);

	}

}
