import java.util.*;
//2017-4-25
public class PermutationSequence {
    public String getPermutation(int n, int k) {
    	List<Integer> lis = new ArrayList<>();
    	int[] fact = new int[n+1];
    	fact[0]=1;
    	int sum = 1;
        
        for(int i = 1; i <= n; i++){
        	lis.add(i);
        	sum*=i;
        	fact[i] = sum;
        }
        k--;	
        String res = "";
        for(int i = 1; i <= n; i++){
        	int m = k/fact[n-i];
        	res+=String.valueOf(lis.get(m));
        	k = k-m*fact[n-i];
        	lis.remove(m);
        }
        System.out.println(res);
        return res;
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationSequence test = new PermutationSequence();
		test.getPermutation(1, 1);
	}

}
