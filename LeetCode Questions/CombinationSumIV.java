import java.util.Arrays;
//2017-3-28
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
    	Arrays.sort(nums);
        int[] res = new int[target+1];
        for(int i = 1; i <= target; i++){
        	for(int num:nums){
        		if(num>i) break;
        		else if(num == i) res[i]++;
        		else if(num<i) res[i]+=res[i-num];
        	}
        }
        return res[target];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSumIV test = new CombinationSumIV();
		int[] nums = {1,2,3};
		int res = test.combinationSum4(nums, 32);
		System.out.println(res);
	}

}
