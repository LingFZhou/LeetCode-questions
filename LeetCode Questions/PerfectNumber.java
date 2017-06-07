import java.util.Collections;
import java.util.HashSet;
//2017-3-25
public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
    	if(num==1) return false;
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
    	for(int i = 2; i <= Math.sqrt(num); i++){
        	if(num%i==0){
        		set.add(i);
        		set.add(num/i);
        	}
        }
    	int res = 0;
    	for(int i:set) res+=i;
    	if(res==num) return true;
    	else return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber test = new PerfectNumber();
		boolean res = test.checkPerfectNumber(4);
		System.out.println(res);
	}

}
