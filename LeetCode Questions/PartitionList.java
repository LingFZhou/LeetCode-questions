//2017-4-11
public class PartitionList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode partition(ListNode head, int x) {
        ListNode s = new ListNode(0);
        ListNode s1 = s;
        ListNode b = new ListNode(0);
        ListNode b1 = b;
        
        while(head!=null){
        	if(head.val<x){ 
        		s1.next = head; 
        		s1 = s1.next;
        		b1.next = head.next;
        	}
        	else{
        		b1.next = head;
        		b1 = b1.next;
        		s1.next = head.next;
        	}
        	head =  head.next;
        }
        s1.next = b.next;
        return s.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionList test = new PartitionList();
		ListNode node1 = test.new ListNode(2);
		ListNode node2 = test.new ListNode(1);
		node1.next = node2;
		test.partition(node1, 2);
	}

}

