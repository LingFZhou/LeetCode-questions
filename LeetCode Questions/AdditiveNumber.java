//2017-5-6
public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        for(int i = 1; i <= num.length()/2; i++){
        	for(int j = 1; Math.max(i, j)<=num.length()-i-j;j++){
        		if(valid(num,i,j)) return true;
        	}
        	
        }
        return false;
    }
    public boolean valid(String num, int i, int j){
    	if(num.charAt(0)=='0'&&i>1) return false;
    	if(num.charAt(i)=='0'&&j>1) return false;
    	Long x1 = Long.parseLong(num.substring(0,i));
    	Long x2 = Long.parseLong(num.substring(i,i+j));
    	String st = "";
    	for(int start = i+j;start!=num.length();start+=st.length()){
    		x2=x1+x2;
    		x1=x2-x1;
    		st=x2.toString();
    		if(!num.startsWith(x2.toString(),start)) return false;
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
