import java.util.LinkedList;
import java.util.Queue;
//2017-2-22
public class ImplementStackusingQueues {
	Queue<Integer> in = new LinkedList<Integer>();
	/** Initialize your data structure here. */
    public ImplementStackusingQueues() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        in.add(x);
        int n = in.size();
        while(n-- > 1) in.add(in.poll());
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return in.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return in.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return in.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
