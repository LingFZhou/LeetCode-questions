//2017-5-6
public class AddTwoNumbers {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(0);
        ListNode lis = res;
        while(l1!=null&&l2!=null){
        	int temp = (l1.val+l2.val+carry)%10;
        	carry = (l1.val+l2.val+carry)/10;
        	res.next = new ListNode(temp);
        	l1 = l1.next;
        	l2 = l2.next;
        	res = res.next;
        }
        if(l1!=null){
        	while(l1!=null){
        		int temp = (l1.val+carry)%10;
            	carry = (l1.val+carry)/10;
            	res.next = new ListNode(temp);
            	l1 = l1.next;
            	res = res.next;
        	}
        }
        else if(l2!=null){
        	while(l2!=null){
        		int temp = (l2.val+carry)%10;
            	carry = (l2.val+carry)/10;
            	res.next = new ListNode(temp);
            	l2 = l2.next;
            	res = res.next;
        	}
        }
        if(carry == 1) res.next = new ListNode(1);
        return lis.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
