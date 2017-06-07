//2017-2-8
public class SortTransformedArray {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
    	int len = nums.length;
    	int[] re = new int[len];
    	if(a==0){
    		if(b>0){
    			for(int i = 0; i < len;i++) re[i] = b*nums[i]+c;
    		}
    		else{
    			for(int i = 0, j = len-1;i<len;i++,j--) re[i] = b*nums[j]+c;
    		}
    		
    	}
    	if(a>0){
    		int m = len-1;
    		for(int i = 0, j = len-1; m>=0;){
        		int left = a*nums[i]*nums[i]+b*nums[i]+c;
    			int right = a*nums[j]*nums[j]+b*nums[j]+c;
        		if(left < right){
        			re[m--] = right;
        			j--;
        		}
        		
        		else{
        			re[m--] =left;
        			i++;
        		}
        	}
    	}
    	if(a<0){
    		int m = 0;
    		for(int i = 0, j = len-1; m<=len-1;){
        		int left = a*nums[i]*nums[i]+b*nums[i]+c;
    			int right = a*nums[j]*nums[j]+b*nums[j]+c;
        		if(left < right){
        			re[m++] = left;
        			i++;
        		}
        		
        		else{
        			re[m++] =right;
        			j--;
        		}
        	}
    	}
        return re;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortTransformedArray test = new SortTransformedArray();
		int[] nums = {-4,-2,2,4};
		int[] re = test.sortTransformedArray(nums, 0, -1, 5);
		for(int n : re)
		System.out.println(n);
	}

}
