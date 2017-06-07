//2017-2-8
public class NthDigit {
    public int findNthDigit(int n) {
    	int num = 9;
    	int k = 1;
    	int re = 1;
    	while(n>k*num){
    		n-=k*num;
    		num*=10;
    		re*=10;
    		k++;
    	}
    	re += (n-1)/k;
        n--;
        int result = Integer.toString(re).charAt(n%k) - '0';
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthDigit test = new NthDigit();
		int r = test.findNthDigit(11);
		System.out.println(r);
	}

}
