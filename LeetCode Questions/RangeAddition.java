//2017-2-5
public class RangeAddition {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] r = new int[length];
        int n = 0;
        for(int i = 0; i < updates.length; i++){
        		r[updates[i][0]] += updates[i][2];
        		if(updates[i][1] < length - 1) r[updates[i][1] + 1] -= updates[i][2];		
        	}
        
    	for(int i = 0; i < length; i++){
    		r[i] += n;
    		n = r[i];
    	}
        return r;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeAddition test = new RangeAddition();
		int[][] updates = {{1,3,2},{2,4,3},{0,2,-2}};
		int[] r = test.getModifiedArray(5, updates);
		for(int n : r) System.out.println(n);
	}

}
