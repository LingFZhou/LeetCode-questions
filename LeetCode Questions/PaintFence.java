//2017-2-14
public class PaintFence {
    public int numWays(int n, int k) {
        int dif = k*(k-1);
        int sam = k;
        if(n == 0) return 0;
        if(n == 1) return k;
        for(int i = 2; i < n; i++){
        	int temp = dif;
        	dif = (dif+sam)*(k-1);
        	sam = temp;
        }
        return dif+sam;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
