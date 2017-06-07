//2017-2-28
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left<right){
        	int mid = left + (right-left)/2;
        	if(isBadVersion(mid)) right = mid;
        	else if(!isBadVersion(mid)) left = mid + 1;
        }
        return left;
    }
    boolean isBadVersion(int version){
    	boolean[] flag = {true,true};
    	return flag[version-1];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstBadVersion test = new FirstBadVersion();
		int res = test.firstBadVersion(2);
		System.out.println(res);
	}

}
