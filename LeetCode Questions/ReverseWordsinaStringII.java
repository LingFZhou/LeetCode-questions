import java.util.Arrays;
//2017-4-23
public class ReverseWordsinaStringII {
    public void reverseWords(char[] s) {
    	if(s.length==0) return;
        reverse(s,0,s.length-1);
        int beg = 0;       
        for(int i = 0; i < s.length; i++){
        	if(s[i]==' '){
        		reverse(s,beg,i-1);
        		beg = i+1;
        	}
        }
        reverse(s,beg,s.length-1);
        System.out.println(s);
        
    }
    public void reverse(char[] s,int start, int end){
    	for(int i = start; i <= (start+end)/2; i++){
    		char temp = s[i];
    		s[i] = s[start+end-i];
    		s[start+end-i] = temp;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaStringII test = new ReverseWordsinaStringII();
		char[] s = {'t','h','!'};
		test.reverseWords(s);
	}

}
