//2017-2-22
public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x){ val = x; next = null;}
	}
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode node1 = head;
        ListNode node2 = head;
        while(node2!=null&&node2.next!=null){
        	node1 = node1.next;
        	node2 = node2.next.next;
        	if(node1 == node2) return true;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCycle test = new LinkedListCycle();
		ListNode head = test.new ListNode(4);
		ListNode node1 = test.new ListNode(2);
		ListNode node2 = test.new ListNode(3);
		ListNode node3 = test.new ListNode(4);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		boolean f = test.hasCycle(head);
		System.out.println(f);
		
		
	}

}
