//2017-5-6
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < num2.length(); i++) sb.append("0");
        for(int i = num1.length()-1; i >=0; i--){
        
        	int index = num1.length()-1-i;
        	int carry = 0;
        	int carry2 = 0;
        	for(int j = num2.length()-1; j>=0; j--){
        		int x2 = num1.charAt(i)-'0';
        		int x1 = num2.charAt(j)-'0';
        		int res = (x1*x2+carry)%10;
        		carry = (x1*x2+carry)/10;
        		int res2 = (sb.charAt(index)-'0'+res+carry2)%10; 
        		carry2 = (sb.charAt(index)-'0'+res+carry2)/10; 
        		sb.replace(index, index+1, String.valueOf(res2));
        		index++;
        	}
        	if(carry+carry2!=0) sb.append(String.valueOf(carry+carry2));
        	else sb.append("0");
        }
        sb.reverse();
        int i = 0;
        while(i<sb.length()&&sb.charAt(i)=='0') i++;
        if(i==sb.length()) return "0";
        else return sb.delete(0, i).toString();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyStrings  test = new MultiplyStrings();
		String num1 = "123";
		String num2 = "456";
		String res = test.multiply(num1, num2);
		System.out.println(res);
	}

}
