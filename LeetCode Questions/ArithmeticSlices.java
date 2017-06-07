//2017-2-5
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
    	int cur=0,sum=0;
        for(int i = 2; i < A.length; i++){
        	if(A[i] - A[i-1] == A[i-1] - A[i-2]){
        		cur++;
        		sum+=cur;
        	}
        	else cur = 0;
        	
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
