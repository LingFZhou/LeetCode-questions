//2017-3-28
public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
		int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
		for(int n:nums){
			if(n<=small) small = n;
			else if(n<=big) big = n;
			else return true;
		}
		return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
