//2017-4-1
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
    	if(a.length() == b.length()){
    		if(a.equals(b)) return -1;
    		else return a.length();
    	}
    	else return Math.max(a.length(), b.length());
//        int lena = a.length(), lenb = b.length();
//        int slen = 0, blen = 0;
//        int res = -1;
//        if(lenb > lena) {
//        	slen = lenb;
//        	blen = lena;
//        	for(int i = 0; i < slen; i++){
//            	for(int j = i + 1; j <= slen; j++){
//            		if(a.indexOf(b.substring(i,j))==-1) res = Math.max(res, j-i);
//            	}
//            }
//        }
//        else {
//        	slen = lena; 
//        	blen = lenb;
//        	for(int i = 0; i < slen; i++){
//        		for(int j = i + 1; j <= slen; j++){
//        			if(b.indexOf(a.substring(i,j))==-1) res = Math.max(res, j-i);
//        		}
//        	}
//        }
//        return res;
//        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestUncommonSubsequenceI test = new LongestUncommonSubsequenceI();
		String a = "abc";
		String b = "abc";
		int res = test.findLUSlength(a, b);
		System.out.println(res);
	}

}
