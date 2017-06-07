
public class RotateArray {
	public void rotate(int[] nums, int k) {
        int n = nums.length;
        int km = k % n;
        int[] nar = new int[km];
        for(int i = 0; i < km; i++){
        	nar[i] = nums[n-km+i];
        }
        for(int j = n-1; j >= km; j--){
            nums[j] = nums[j-km];
        }
        for(int m = 0; m < km; m++){
        	nums[m] = nar[m];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray test = new RotateArray();
		int[] array = {-1};
		test.rotate(array, 2);
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}

}
