//2017-2-13
public class Sqrtx {
    public int mySqrt(int x) {
        long i = 0; 
        long j = x;
        long res = 0;
        if(x == 1) return 1;	
        while(i<j){
        	long mid = (i+j)/2;
        	if(mid*mid == x){res = mid;break;}
        	if((mid+1)*(mid+1)<=x) i = mid;
        	else if(mid*mid>x) j = mid;
        	else {res = mid; break;}
        }
        return (int) res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrtx test = new Sqrtx();
		int n = test.mySqrt(2147395599);
		System.out.println(n);
	}

}
