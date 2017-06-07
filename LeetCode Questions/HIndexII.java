//2017-4-4
public class HIndexII {
	public int hIndex(int[] citations) {
        int res = 0;
        int len = citations.length;
        int left = 1, right = len;
        if(len == 1&&citations[0]>=1) return 1;
        if(len == 1&&citations[0]<1) return 0;
        while(left<=right){
        	int mid = left + (right-left)/2;
        	if(citations[len-mid]>=mid){
        		if(len-mid-1<0){
        			res = Math.max(res, mid);
        			return res;
        		}
        		else{
        			if(citations[len-mid-1]<=mid){
        				res = Math.max(res, mid);
        				left = mid+1;
        			}
        			else left=mid+1;
        		}
        	}
        	else if(citations[len-mid]<mid) {
        		right = mid;
        		if(left == right) return res;
        	}
        	
        }        
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HIndexII test = new HIndexII();
		int[] citations = {1,1,1,1,3,4,5,6};
		System.out.println(test.hIndex(citations));
	}

}
