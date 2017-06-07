//2017-4-22
public class LinkedListCycleII {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null&&fast.next!=null){
        	slow = slow.next;
        	fast = fast.next.next;   	
        	if(slow == fast){
        		ListNode slow2 = head; 
	            while (slow2 != slow){
	                slow = slow.next;
	                slow2 = slow2.next;
	            }	
	            return slow;
        	}
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
