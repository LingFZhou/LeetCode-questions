//2017-2-2
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
//		int i = 1;
//	     while (num > 0) {
//	         num -= i;
//	         i += 2;
//	     }
//	     return num == 0;
        int low = 1, high = num;
        while(low <= high){
        	double mid = (low + high) / 2;
        	if( mid * mid == num) return true;
        	else if(mid * mid > num ) high = (int) mid - 1;
        	else low = (int) mid + 1;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPerfectSquare test = new ValidPerfectSquare();
		int sum = 9;
		boolean flag = test.isPerfectSquare(sum);
		System.out.println(flag);
		
		
	}

}
