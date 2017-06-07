//2017-2-22
public class PalindromeLinkedList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x; next = null;}
	}
    public boolean isPalindrome(ListNode head) {
    	if(head == null) return true;
        if(head.next == null) return true;
        ListNode reverse = head;
        ListNode inorder = head;
        ListNode end = head;
        ListNode prev = reverse;
        while(end!=null&&end.next!=null){
        	end = end.next.next;
        	prev = reverse;
        	reverse = inorder;
        	inorder = inorder.next;
        	reverse.next = prev;
        }
        if(end!=null ) inorder = inorder.next;
        while(inorder!=null){
            if(inorder.val!=reverse.val) return false;
            inorder = inorder.next;
            reverse = reverse.next;
        }
        return true;
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeLinkedList test = new PalindromeLinkedList();
		ListNode node = test.new ListNode(2);
		node.next = test.new ListNode(2);
		boolean f = test.isPalindrome(node);
		System.out.println(f);
	}

}
