//2017-2-8
public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
    	int sum = 0;
        for(int i = 0; i <32;i++){
        	int bitcount = 0;
        	for(int j = 0; j < nums.length;j++){
        		bitcount += (nums[j]>>i)&1;
        	}
        	sum+= bitcount*(nums.length-bitcount);
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalHammingDistance test = new TotalHammingDistance();
		int[] nums = {4,14,2};
		int r = test.totalHammingDistance(nums);
		System.out.println(r);
	}

}
