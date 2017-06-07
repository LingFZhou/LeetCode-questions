//2017-5-5
public class RemoveDuplicatesfromSortedListII {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        
        ListNode prev = new ListNode(0);
        ListNode node = prev;
        int m = head.val-10;
        while(head.next!=null){
        	if(head.val==head.next.val){
        		m = head.val;
        	}
        	else if(head.val!=head.next.val&&m!=head.val){
        		prev.next = head;
        		prev = head;	
        	}
        	head = head.next;
        	
        }
        if(head.val!=m) prev.next = head;
        else prev.next = null;
        return node.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
