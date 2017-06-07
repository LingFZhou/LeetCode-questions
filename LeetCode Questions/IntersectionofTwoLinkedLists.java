//2017-2-26
public class IntersectionofTwoLinkedLists {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	int lenA = 0 , lenB = 0;
    	ListNode a = headA;
    	ListNode b = headB;
        while(a!=null){
        	a = a.next;
        	lenA++;
        }
        while(b!=null){
        	b = b.next;
        	lenB++;
        }
        while(lenA>lenB){
        	headA = headA.next;
        	lenA--;
        }
        while(lenB>lenA){
        	headB = headB.next;
        	lenB--;
        }
        while(headA!=headB){
        	headA = headA.next;
        	headB = headB.next;
        }
        return headA;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
