//2017-4-29
public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length==0||nums[0].length==0) return nums;
        int m = nums.length, n = nums[0].length;
        if(m*n!=r*c) return nums;
        int[] temp = new int[m*n];
        for(int i = 0; i < m*n; i++){
        	temp[i] = nums[i/n][i%n];
        }
        int[][] res = new int[r][c];
        int count = 0;
        for(int i = 0; i < r; i++){
        	for(int j = 0; j < c; j++){
        		res[i][j]=temp[count++];
        	}
        }
        
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReshapetheMatrix test = new ReshapetheMatrix();
		int[][] nums = {{1,2},{3,1}};
		int[][] res = test.matrixReshape(nums, 4, 1);
		for(int i = 0; i < res.length; i++){
        	for(int j = 0; j < res[0].length; j++){
        		System.out.print(res[i][j]);
        	}
        	System.out.println();
        }
		
	}

}
