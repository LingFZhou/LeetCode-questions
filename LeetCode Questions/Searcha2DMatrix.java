//2017-3-19
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length==0) return false;
    	if(matrix[0].length == 0) return false;
        for(int i = 0, j = matrix[0].length-1; i<matrix.length&&j>=0;){
        	if(matrix[i][j] == target) return true;
        	else if(matrix[i][j]>target) j--;
        	else if(matrix[i][j]<target) i++;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
