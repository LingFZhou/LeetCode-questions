//2017-3-26
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    	int curmax = 0;
        int i = 0,j=height.length-1;
        while(i < j){
        	
        	int h = Math.min(height[i], height[j]);
        	int w = j-i;
        	int area = h*w;
        	curmax = Math.max(curmax, area);
        	if(height[i]<height[j]) i++;
        	else j--;
        	
        }
        return curmax;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater test = new ContainerWithMostWater();
		int[] height = {3,6,3,5,8,9,5};
		int res = test.maxArea(height);
		System.out.println(res);
	}

}
