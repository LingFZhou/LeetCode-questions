//2017-3-17
public class SortColors {
    public void sortColors(int[] nums) {
        int index1 = Integer.MAX_VALUE, index2 = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i]==1) index1 = Math.min(index1, i);
        	if(nums[i]==2) index2 = Math.min(index2, i);
        	if(nums[i]==0&&i>index1){
        		int temp = nums[i];
        		nums[i] = nums[index1];
        		nums[index1] = temp;
        		index1++;
        	}
        	if(nums[i]==1&&i>index2){
        		int temp = nums[i];
        		nums[i] = nums[index2];
        		nums[index2] = temp;
        		index2++;
        		if(index2==1||(index2>=2&&nums[index2-2]==0)) index1 = index2-1;
        	}
        	if(nums[i]==0&&i>index2&&index1==Integer.MAX_VALUE){
        		int temp = nums[i];
        		nums[i] = nums[index2];
        		nums[index2] = temp;
        		index2++;
        	}
        }
        for(int i:nums) System.out.println(i);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors test = new SortColors();
		int[] nums = {2,1,2,0,2,0,1};
		test.sortColors(nums);
	}

}
