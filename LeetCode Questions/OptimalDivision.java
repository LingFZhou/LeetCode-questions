//2017-4-15
public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        String res = "";
        if(nums.length==0) return res;
        if(nums.length==1) return res+nums[0];
        if(nums.length==2) return res+nums[0]+"/"+nums[1];
        res += nums[0]+"/(";
        
        for(int i = 1; i < nums.length-1; i++){
        	res+=nums[i]+"/";
        }
        res+=nums[nums.length-1]+")";
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptimalDivision test = new OptimalDivision();
		int[] nums = {100,10,2};
		String s = test.optimalDivision(nums);
		System.out.println(s);
	}

}
