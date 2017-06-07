//2017-4-1
public class SwapNodesinPairs {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x;}
	}
    public ListNode swapPairs(ListNode head) {
    	ListNode start = new ListNode(0);
    	start.next = head;
    	ListNode node = start;
        while(node.next!=null&&node.next.next!=null){
        	ListNode temp1 = node.next;
        	ListNode temp2 = node.next.next;
        	temp1.next = temp2.next;
        	node.next = temp2;
        	node.next.next = temp1;
        	node = node.next.next; 
        		
        }
        return start.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNodesinPairs test = new SwapNodesinPairs();
		ListNode head = test.new ListNode(1);
		ListNode node1 = test.new ListNode(2);
		ListNode node2 = test.new ListNode(3);
		ListNode node3 = test.new ListNode(4);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		ListNode res = test.swapPairs(head);
		while(res!=null){
			System.out.println(res.val);
			res = res.next;
		}
		
	}

}
