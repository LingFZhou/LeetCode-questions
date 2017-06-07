//2017-1-30
public class RemoveDuplicatesfromSortedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val?head.next:head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesfromSortedList test = new RemoveDuplicatesfromSortedList();
		ListNode head = test.new ListNode(23);
		head.next = test.new ListNode(4);
		ListNode h = test.deleteDuplicates(head);
		
		System.out.println(head.val);
	}

}
