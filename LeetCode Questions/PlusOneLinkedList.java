//2017-2-5
public class PlusOneLinkedList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x;}
	}
	public ListNode plusOne(ListNode head) {
		int carry = 0;
		carry = plus(head, carry);
		if(carry == 1) {
			ListNode ln = new ListNode(1);
			ln.next = head;
			return ln;
		}
		return head;
    }
	public int plus(ListNode head, int carry){
		if(head == null) return 1;
		int n = plus(head.next,carry);
		carry = (head.val + n)/10;
		head.val = (head.val + n) % 10;
		return carry;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOneLinkedList test = new PlusOneLinkedList();
		ListNode head = test.new ListNode(9);
//		ListNode head1 = test.new ListNode(9);
//		ListNode head2 = test.new ListNode(9);
//		head.next = head1;
//		head1.next = head2;
		ListNode r = test.plusOne(head);
		while(r != null){
			System.out.println(r.val);
			r = r.next;
		}
	}

}
