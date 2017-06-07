//2017-3-24
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rows = false;
        boolean cols = false;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(matrix[i][j] == 0){
        			matrix[i][0] = 0;
        			matrix[0][j] = 0;
        			if(i == 0) rows = true;
        			if(j == 0) cols = true;
        		}
        	}
        }
        for(int i = 1; i < m; i++){
        	for(int j = 1; j < n; j++){
        		if(matrix[i][0]==0||matrix[0][j]==0) matrix[i][j]=0;
        	}
        }
        if(rows)
        	for(int i = 1; i < n; i++) matrix[0][i]=0;
        if(cols)
        	for(int i = 1; i < m; i++) matrix[i][0]=0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
