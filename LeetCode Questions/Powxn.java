//2017-4-24
public class Powxn {
    public double myPow(double x, int n) {
    	double res = 0;
    	if(n==0) return 1;
    	if(n%2==1)	res = x*(myPow(x,n-1));
    	
    	else if(n%2==0) {
    		if(n<0) res = 1/myPow(x*x,-(n/2));
    		else res = myPow(x*x,n/2);
    	}
    	else res = 1/(x*(myPow(x,-n-1)));
    	return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Powxn test = new Powxn();
		System.out.println(test.myPow(2,Integer.MIN_VALUE));
	}

}
