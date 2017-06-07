//2017-3-26
public class TrappingRainWater {
    public int trap(int[] height) {
    	if(height.length<3) return 0;
    	int res = 0;
        int i = 0, j = height.length-1;
        while(i<j&&height[i]<height[i+1]) i++;
        while(i<j&&height[j]<height[j-1]) j--;
        while(i<j){
        	int left = height[i];
        	int right = height[j];
        	if(left<=right){
        		while(i<j&&left>=height[++i]) res+=left-height[i];
        	}
        	else{
        		while(i<j&&right>height[--j]) res += right-height[j];
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
