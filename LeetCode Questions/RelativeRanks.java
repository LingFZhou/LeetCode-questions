import java.util.Arrays;
//2017-2-4
public class RelativeRanks {
	public String[] findRelativeRanks(int[] nums) {
        int[] num = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
        	num[i] = nums[i];
        }
        Arrays.sort(num);
        int le = nums.length;
        String[] st = new String[nums.length];
        for(int i = 0; i < le; i++){
        	if(nums[i] == num[le - 1]) st[i] = "Gold Medal";
        	else if(nums[i] == num[le - 2]) st[i] = "Silver Medal";
        	else if(nums[i] == num[le - 3]) st[i] = "Bronze Medal";
        	else{
        		for(int j = 0; j < le; j ++){
        			if(nums[i] == num[j]){
        				st[i] = "" + (le - j);
        			}
        		}
        	}
        }
        return st;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelativeRanks test = new RelativeRanks();
		int[] nums = {5,4,3,2,1};
		String[] st = test.findRelativeRanks(nums);
		for(String s : st) System.out.println(s);
	}

}
