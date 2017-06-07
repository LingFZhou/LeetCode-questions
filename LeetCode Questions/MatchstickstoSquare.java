import java.util.Arrays;
//2017-3-31
public class MatchstickstoSquare {
    public boolean makesquare(int[] nums) {
        if(nums.length < 4) return false;
        int sum = 0;	
        for(int n: nums) sum+=n;
        if(sum%4!=0) return false;
        int target = sum/4;
        Arrays.sort(nums);
        for(int i = 0, j = nums.length-1; i<j;i++,j--){
        	int temp = nums[i];
        	nums[i]= nums[j];
        	nums[j]= temp;
        }
        return dfs(nums,new int[4], 0, target);
        
    }
    public boolean dfs(int[] nums, int[] sum, int index, int target){
    	if(index == nums.length){
    		if(sum[0]==target&&sum[1]==target&&sum[2]==target) return true;
    		else return false;
    	}
    	for(int i = 0; i < 4; i++){
    		if(sum[i]+nums[index]>target) continue;
    		sum[i] += nums[index];
    		if(dfs(nums,sum,index+1,target)) return true;
    		sum[i]-=nums[index];
    	}
    	return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
