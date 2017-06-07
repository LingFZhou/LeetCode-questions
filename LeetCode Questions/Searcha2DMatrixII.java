//2017-3-27
public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        if(matrix[0].length==0) return false;
        for(int i = 0, j = matrix[0].length-1; i<matrix.length&&j>=0;){
        	if(matrix[i][j]==target) return true;
        	if(matrix[i][j]>target) j--;
        	else if(matrix[i][j]<target) i++;
        }
        return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searcha2DMatrixII test = new Searcha2DMatrixII();
		int[][] matrix = {{1,   4,  7, 11, 15},
		  {2,   5,  8, 12, 19},
		  {3,   6,  9, 16, 22},
		  {10, 13, 14, 17, 24},
		  {18, 21, 23, 26, 30}};
		boolean res = test.searchMatrix(matrix, 20);
		System.out.println(res);
	}

}
