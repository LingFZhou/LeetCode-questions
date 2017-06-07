import java.util.HashMap;
//2017-2-11
public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap();
        int result = 0;
        for(int i : A)
        	for(int j : B)
        		map.put(i+j, map.getOrDefault(i+j, 0)+1);
        for(int i : C)
        	for(int j : D)
        		result += map.getOrDefault(-i-j, 0);
        	
        return result;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
