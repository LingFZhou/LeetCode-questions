//2017-2-23
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
    	int[] temp = new int[3];
        boolean[] flag = new boolean[3];
        for(int i = 0; i < 3; i++) {
        	temp[i] = Integer.MIN_VALUE;
        	flag[i] = true;
        }
        for(int i = 0; i < 3; i++){
        	int curmax = Integer.MIN_VALUE;
        	for(int j = 0; j < nums.length;j++){
        		if(nums[j]!=temp[0]&&nums[j]!=temp[1]){
        			curmax = Math.max(nums[j], curmax);
        			flag[i] = false;
        		}
        			
        	}
        	temp[i] = curmax;
        }
        if(flag[2] == true) return temp[0];
        else return temp[2];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdMaximumNumber test = new ThirdMaximumNumber();
		int[] nums = {2};
		int res = test.thirdMax(nums);
		System.out.println(res);
	}

}
