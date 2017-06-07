import java.util.*;
//2017-3-27
public class LinkedListRandomNode {
	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	ListNode head;
    Random random;
    
    public LinkedListRandomNode(ListNode h) {
        head = h;       
        random = new Random();        
    }
    
    public int getRandom() {
        ListNode c = head;
        int r = c.val;
        for(int i=1;c.next != null;i++){
            c = c.next;
            if(random.nextInt(i + 1) == i) r = c.val;                        
        }
        return r;
    }
    
    /** Returns a random node's value. */
    
	public static void main(String[] args) {
		ListNode h = new ListNode(10);
		ListNode h1 = new ListNode(1);
		ListNode h2 = new ListNode(20);
		ListNode h3 = new ListNode(10);
		ListNode h4 = new ListNode(100);
		h.next = h1;h1.next=h2;h2.next=h3;h3.next=h4;
		LinkedListRandomNode test = new LinkedListRandomNode(h);
		System.out.println(test.getRandom());
	}

}
