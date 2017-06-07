import java.util.Random;
//2017-2-7
public class ShuffleanArray {
	int[] nums;
	Random random;
    public ShuffleanArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums.length == 0) return null;
        int[] a = nums.clone();
        for(int i = 0; i < a.length; i++){
        	int j = random.nextInt(i+1);
        	int b = a[i];
        	a[i] = a[j];
        	a[j] = b;
        }
        return a;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		ShuffleanArray test = new ShuffleanArray(nums);
		int[] r = test.shuffle();
		for(int n : r) System.out.println(n);
	}

}
