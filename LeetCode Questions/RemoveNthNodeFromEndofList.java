//2017-4-11
public class RemoveNthNodeFromEndofList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head ==null||head.next==null) return null;
        ListNode slow = head, fast = head;
        int len = 0;
        while(slow!=null){
        	slow = slow.next;
        	len++;
        }
        int m = len-n;
        if(m==0) return head.next;
        while(m>1){
        	fast = fast.next;
        	m--;
        }
        ListNode cur = fast.next;
        fast.next = cur.next;
        cur.next = null;
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
