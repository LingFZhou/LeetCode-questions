import java.util.Arrays;
//2017-4-4
public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        int len = citations.length;
        for(int i = 1; i <= len; i++){
        	if(citations[len-i]>=i){
        		if(len-i-1<0) res = Math.max(res, i);
        		else if(citations[len-i-1]<=i) res = Math.max(res, i);
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HIndex test = new HIndex();
		int[] citations = {0};
		int res = test.hIndex(citations);
		System.out.println(res);
	}

}
