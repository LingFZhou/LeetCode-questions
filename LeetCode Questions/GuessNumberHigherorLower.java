//2017-2-14
public class GuessNumberHigherorLower {
    public int guessNumber(int n,int target) {
        int left = 0, right = n;
        int mid = (left+right)/2;
        int j = mid;
        while(j != target) {
            if(j>target){
                right = mid;
                j = left+(right-left)/2;
                mid = left+(right-left)/2;
            }
            if(j<target){
                left = mid;
                j = left+(right-left)/2;
                mid = left+(right-left)/2;
            }
        }
        int res = (int) j;
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNumberHigherorLower test = new GuessNumberHigherorLower();
		int res = test.guessNumber(2126753390, 1702766719);
		System.out.println(res);
	}

}
