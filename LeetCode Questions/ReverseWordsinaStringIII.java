//2017-4-8
public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
    	String res = "";
    	while(s.length()>0){
    		int m = s.indexOf(' ');
	        StringBuilder t = new StringBuilder();
	        if(m!=-1){
	        	t.append(s.substring(0,m));
		        t.reverse();
		        s = s.substring(m+1);
		        res+=t.toString()+" ";
		        }
	        else if(m==-1){
	        	t.append(s);
		        t.reverse();
		        s = "";
		        res+=t.toString();
		        }
	        
	        System.out.println(t);
	        System.out.println(s);
    	}
    	System.out.println(res);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaStringIII test = new ReverseWordsinaStringIII();
		String s = "Let's take LeetCode contest";
		test.reverseWords(s);
	}

}
