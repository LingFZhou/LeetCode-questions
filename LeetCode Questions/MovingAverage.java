//2017-1-26
public class MovingAverage {
    private int sum = 0;
    private int ave = 0;
    private int n = 0;
    private int last = 0;
    private int[] window;
    
    /** Initialize your data structure here. */
    
    public MovingAverage(int size) {
        window = new int[size];
        
    }
    
    public double next(int val) {
        if(n<window.length) n++;
        sum = sum-window[last] + val;
        ave = sum/n;
        window[last] = val;
        last = (last+1)%window.length;
        return (double)sum/n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingAverage test = new MovingAverage(3);
		System.out.println(test.next(1));
		System.out.println(test.next(5));
		System.out.println(test.next(6));
		System.out.println(test.next(8));
		
	}

}
