import java.util.*;
//2017-4-9
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
    	List<String> res = new ArrayList<>();
        if(nums.length == 1){
        	res.add(nums[0]+""); return res;
        }
        for(int i = 0; i < nums.length; i++){
        	int t = nums[i];
        	while(i+1<nums.length&&nums[i+1]-nums[i]==1) i++;
        	if(t==nums[i]) res.add(t+"");
        	else res.add(t+"->"+nums[i]);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SummaryRanges test = new SummaryRanges();
		int[] nums = {0,1,2,4,5,7};
		List<String> res = test.summaryRanges(nums);
		System.out.println(res);
	}

}
