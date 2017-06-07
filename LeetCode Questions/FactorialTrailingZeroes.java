//2017-2-14
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
    	if(n<=0) return 0;
    	int count = 0;
    	for(long i = 5; n/i>0;i*=5)
    		count += n/i;
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialTrailingZeroes test = new FactorialTrailingZeroes();
		int res = test.trailingZeroes(1808548329);
		System.out.println(res);
	}

}
