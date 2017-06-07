//2017-2-8	
public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
    	if(n == 0) return 2;
    	int cursum = 9;
    	int sum = 10;
        for(int i = 2; i <=n;i++){
        	cursum = cursum*(9-i+2);
        	sum+=cursum;
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumberswithUniqueDigits test = new CountNumberswithUniqueDigits();
		int sum = test.countNumbersWithUniqueDigits(3);
		System.out.println(sum);
	}

}
