//2017-4-23
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = nums.length-1;
        while(index > 0){
        	if(nums[index-1]<nums[index]) break;
        	index--;
        }
        if(index==0){ reverse(nums,0,nums.length-1); return;}
        else{
        	int val = nums[index-1];
        	int j = nums.length-1;
        	while(j>=index){
        		if(nums[j]>val) break;
        		j--;
        	}
        	swap(nums,index-1,j);
        	reverse(nums,index,nums.length-1);
        	return;
        }
    }
    public void swap(int[] nums, int start, int end){
    	int temp = nums[start];
    	nums[start] = nums[end];
    	nums[end] = temp;
    }
    public void reverse(int[] nums,int start,int end){
    	for(int i = start; i <= (start+end)/2; i++){
    		swap(nums, i, start+end-i);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
