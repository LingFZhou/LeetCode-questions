//2017-3-11
public class ReverseStringII {
    public String reverseStr(String s, int k) {
    	int len = s.length();
    	if(len == 0) return "";
    	int rest = len%(2*k);
    	int div = len/(2*k);
    	StringBuilder res = new StringBuilder();
        for(int i = 0; i+2*k <= len; i+=2*k ){
        	StringBuilder ts = new StringBuilder();
        	ts.append(s.substring(i, i+k));
        	ts = ts.reverse();
        	res.append(ts);
        	res.append(s.substring(i+k,i+2*k));
        	
        }
        
        if(rest < k&&rest!=0) {
        	StringBuilder rs = new StringBuilder();
        	rs.append(s.substring(div*2*k));
        	rs = rs.reverse();
        	res.append(rs);
        }
        
        else if(rest>=k){
        	StringBuilder rs = new StringBuilder();
        	rs.append(s.substring(div*2*k,div*2*k+k));
        	rs = rs.reverse();
        	res.append(rs);
        	res.append(s.substring(div*2*k+k));
        }
        
        return res.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringII test = new ReverseStringII();
		String s = "abcdefghijkmby";
		String res = test.reverseStr(s, 3);
		System.out.println(res);
	}

}
