//2017-4-13
public class RotateFunction {
    public int maxRotateFunction(int[] A) {
    	if(A.length==0) return 0;
        int len = A.length;
        long wsum = 0;
        long sum = 0;
        
        for(int i = 0; i < len; i++){
        	wsum+=A[i]*i;
        	sum+=A[i];
        }
        long maxsum = wsum;
        for(int i = len-1; i>0;i--){
        	wsum = wsum + sum - len*A[i];
        	maxsum = Math.max(maxsum, wsum);
        }
        
        return (int) maxsum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateFunction test = new RotateFunction();
		int[] A = {-2147483648,-2147483648};
		int res = test.maxRotateFunction(A);
		System.out.println(res);
	}

}
