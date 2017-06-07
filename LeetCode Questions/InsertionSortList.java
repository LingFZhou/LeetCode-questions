//2017-4-10
public class InsertionSortList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode insertionSortList(ListNode head) {
        ListNode start = new ListNode(1);
        ListNode pre = start;
        ListNode cur = head;
        ListNode next = null;
        while(cur!=null){
        	next = cur.next;
        	while(pre.next!=null&&pre.next.val<cur.val) pre = pre.next;
        	cur.next = pre.next;
        	pre.next = cur;
        	pre = start;
        	cur = next;
        }
        return start.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
