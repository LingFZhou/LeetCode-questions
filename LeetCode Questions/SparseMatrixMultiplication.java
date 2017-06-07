//2017-3-3
public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for(int i = 0; i < res.length; i++ ){
        	for(int j = 0; j < B.length ; j++){
        		if(A[i][j]!=0){
        			for(int k = 0; k < res[0].length; k++){
            			if(B[j][k]!=0) res[i][k] += A[i][j]*B[j][k];
            		}
        		}
        		
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparseMatrixMultiplication test = new SparseMatrixMultiplication();
		int[][] A = {{1,0,0},{-1,0,3}};
		int[][] B = {{7,0,0},{0,0,0},{0,0,1}};
		int[][] res = test.multiply(A, B);
		for(int i = 0; i < res.length; i++){
			for(int j = 0; j < res[i].length;j++) System.out.print(res[i][j]);
			System.out.println();
		}
	}

}
