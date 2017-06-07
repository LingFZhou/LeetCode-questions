//2017-2-7
public class IntegerBreak {
    public int integerBreak(int n) {
    	if(n==1) return 0;
    	if(n==2) return 1;
    	if(n == 3) return 2;
        if(n%3==1) return (int) (4*Math.pow(3, (n-4)/3));
        if(n%3==2) return (int) (2*Math.pow(3, (n-2)/3));
        return(int) Math.pow(3, n/3);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerBreak test = new IntegerBreak();
		int r = test.integerBreak(7);
		System.out.println(r);
	}

}
