import java.util.*;
//2017-3-18
public class OutputContestMatches {
    public String findContestMatch(int n) {
        List<String> st = new ArrayList<>();
        for(int i = 1; i <= n/2; i++){
        	String t1 = String.valueOf(i);
        	String t2 = String.valueOf((n-i+1));
        	st.add("("+t1+","+t2+")");
        }
        int count = 0;
        while(n!=1){
        	n/=2;
        	count++;
        }
        for(int i = 0; i < count-1; i++){
        	int len = st.size();
        	for(int j = 0; j < len/2;j++){
        		st.add("("+st.get(j)+","+st.get(len-j-1)+")");
        	}
        	for(int k = 0; k < len; k++) st.remove(0);
        }
        
        return st.get(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputContestMatches test = new OutputContestMatches();
		String res = test.findContestMatch(16);
		System.out.println(res);
	}

}
