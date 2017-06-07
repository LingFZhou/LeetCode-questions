import java.util.*;
//2017-4-3
public class BeautifulArrangement {
	int count = 0;
    public int countArrangement(int N) {
        int[] use = new int[N+1];
        helper(N,1,use);
        return count;
    }
    public void helper(int N, int index, int[] use){
    	if(index>N) {count++; return;}
    	for(int i = 1; i <= N; i++){
    		if(use[i]==0&&(index%i==0||i%index==0)){
	    		use[i] = 1;
	    		helper(N,index+1,use);
	    		use[i] = 0;
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
