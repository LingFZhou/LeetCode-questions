//2017-3-30
public class RotateImage {
	public void rotate(int[][] matrix) {
		int n = matrix.length-1;
        for(int i = 0; i < n; i++){
        	for(int j = i; j< n-i; j++){
        		int lefttop = matrix[i][j];
        		int righttop = matrix[j][n-i];
        		int rightbottom = matrix[n-i][n-j];
        		int leftbottom = matrix[n-j][i];
        		matrix[i][j] = leftbottom;
        		matrix[j][n-i] = lefttop;
        		matrix[n-i][n-j] = righttop;
        		matrix[n-j][i] = rightbottom;
        	}
        }
        for(int i = 0; i <= n; i++){
        	for(int m : matrix[i])System.out.print(m);
        	System.out.println();
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateImage test = new RotateImage();
		int[][] matrix = {
				{3, 4, 6, 7, 8},
				{2, 3, 5, 3, 1},
				{8, 5, 3, 2, 9},
				{0, 2, 4, 6, 1},
				{6, 7, 3, 4, 2}};
		test.rotate(matrix);
	}

}

