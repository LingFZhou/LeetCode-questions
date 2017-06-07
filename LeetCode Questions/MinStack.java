import java.util.Stack;
//2017-2-27
public class MinStack {
	long min;
	/** initialize your data structure here. */
    Stack<Long> stack;
	
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
    	if(stack.isEmpty()){
    		stack.push(0L);
    		min = x;
    	}
    	else{
    		stack.push(x-min);
            if(min > x) min = x;
    	}
    }
    
    public void pop() {
    	if(stack.isEmpty()) return ;
    	long temp = stack.pop();
    	if(temp<0)
        min = min - temp;
    }
    
    public int top() {
        if(stack.peek()<=0)  return (int) min;
        else return (int) (min+stack.peek());
    }
    
    public int getMin() {
        return (int) min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
