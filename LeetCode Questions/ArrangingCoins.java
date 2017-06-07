//2017-2-7
public class ArrangingCoins {
    public int arrangeCoins(int n) {
    	int i = 1;
    	int count = 0;
        while(n >= 0){
        	n = n - i;
        	i++;
        	count++;
        }
        return count - 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangingCoins test = new ArrangingCoins();
		int r = test.arrangeCoins(19);
		System.out.println(r);
	}

}
