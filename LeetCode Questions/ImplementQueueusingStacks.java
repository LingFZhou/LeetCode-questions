import java.util.ArrayList;
import java.util.Stack;
//2017-2-22
public class ImplementQueueusingStacks {
	Stack<Integer> in = new Stack();
	Stack<Integer> out = new Stack<>();
	public ImplementQueueusingStacks() {
		
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return out.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(out.empty())
        	while(!in.empty()) out.push(in.pop());
        return out.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.empty()&&out.empty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueusingStacks test = new ImplementQueueusingStacks();
		test.push(3);
	}

}
