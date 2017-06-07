import java.util.*;
//2017-3-25
public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        ugly[0] = 1;
        for(int i = 1; i < n; i++){
        	ugly[i] = Integer.MAX_VALUE;
        	for(int j = 0; j < primes.length; j++)
        		ugly[i] = Math.min(ugly[i], primes[j]*ugly[index[j]]);
        	for(int j = 0; j < primes.length; j++)
        		if(primes[j]*ugly[index[j]]==ugly[i]) index[j]++;
        }
        return ugly[n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperUglyNumber test = new SuperUglyNumber();
		int[] primes = {2,7,13,19};
		int res = test.nthSuperUglyNumber(11, primes);
		System.out.println(res);
	}

}
