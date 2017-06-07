//2017-3-25
public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
    	int res = 0;
        if(m==n) return m;
        for(int i = 31; i >0; i--){
        	int temp = 1<<i;
        	if((m&temp)==temp&&(n&temp)==temp) res+=temp;
        	if((m&temp)==0&&(n&temp)==temp){
        		break;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitwiseANDofNumbersRange test = new BitwiseANDofNumbersRange();
		int res = test.rangeBitwiseAnd(2, 6);
		System.out.println(res);
	}

}
