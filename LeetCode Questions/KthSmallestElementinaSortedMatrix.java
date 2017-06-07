//2017-3-11
public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0], right = matrix[n-1][n-1];
        while(left<right){
        	int mid = left+(right-left)/2;
        	int count = getcount(matrix, mid);
        	if(k<count) right = mid;
        	else left = mid+1;
        }
        return left;
    }
    public int getcount(int[][] matrix, int val){
    	int n = matrix.length;
    	int i = n-1, j = 0, res = 0;
    	while(i>=0&&j<n){
    		if(matrix[i][j]>val) i--;
    		else{
    			res+=i+1;
    			j++;
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
