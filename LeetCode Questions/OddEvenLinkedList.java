import java.util.PriorityQueue;
//2017-3-16
public class OddEvenLinkedList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){x = val;}
	}
    public ListNode oddEvenList(ListNode head) {
    	if(head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while(even!=null&&even.next != null){
        	odd.next = odd.next.next;
        	even.next = even.next.next;
        	odd = odd.next;
        	even = even.next;
        }
        odd.next = evenhead;
        return head;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
