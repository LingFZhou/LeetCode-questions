import java.util.Arrays;
//2017-4-22
public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int curres = Integer.MAX_VALUE;
        for(int i = 0; i < len-2; i++){
        	int m = nums[i];
        	for(int j = i+1,k= len-1; j<k;){
        		int t = m+nums[j]+nums[k];
        		if(Math.abs(curres)>Math.abs(t-target)) curres = t-target;
        		if(t>target) k--;
        		else j++;
        	}
        }
        return target+curres;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeSumClosest test = new threeSumClosest();
		int[] nums = {-1,2,1,-4,3};
		int res = test.threeSumClosest(nums, 3);
		System.out.println(res);
	}

}
