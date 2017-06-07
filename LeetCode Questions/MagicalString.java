//2017-2-7
public class MagicalString {
    public int magicalString(int n) {
        int r = 0;
        StringBuilder st= new StringBuilder("122");
        int i = 2;
        int len = st.length();
        while(st.length()<n){
	        if(st.charAt(i) == '1'){
	        	if(st.charAt(len-1) == '1') st.append(2);
	        	else st.append(1);
	        	len++;
	        }
	        else{
	        	if(st.charAt(len-1)=='1') st.append(22);
	        	else st.append(11);
	        	len+=2;
	        }
	        i++;
        }
        for(int k = 0; k < n; k++){
        	if(st.charAt(k) == '1') r++;
        }
        return r;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicalString test = new MagicalString();
		int r = test.magicalString(12);
		System.out.println(r);
	}

}
