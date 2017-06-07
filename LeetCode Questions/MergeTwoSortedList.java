//2017-2-3
public class MergeTwoSortedList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x;}
	}
	public ListNode MergetwoSortedList(ListNode l1, ListNode l2){
		if(l1==null&&l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
		ListNode n = new ListNode(0);
		ListNode nl = n;
		while(l1!=null&&l2!=null){
			if(l1.val <= l2.val) {
				nl.next = l1;
				l1 = l1.next;
			}
			else {
				nl = l2;
				l2 = l2.next;
			}
			nl = nl.next;
		}
		if(l1!=null) {
			nl.next = l1;
		}
		if(l2!=null) {
			nl.next = l2;
		}
		return n.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
