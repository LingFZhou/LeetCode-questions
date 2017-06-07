import java.util.*;
//2017-3-29
public class BasicCalculatorII {
    public int calculate(String s) {
    	List<Integer> lis = new ArrayList<>();
    	List<Character> op = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
        	char c = s.charAt(i);
        	if(Character.isDigit(c)){
        		int m = 0;
        		while(Character.isDigit(c)&&i<s.length()) {
        			m=m*10+(c-'0');
        			i++; 
        			if(i<s.length()) c=s.charAt(i);
        		}
        		i--;
        		lis.add(m);
        	}
        	else if(c!=' ')op.add(c);
        }
        
        System.out.println(lis);
        System.out.println(op);
        
        for(int i = 0; i < op.size(); i++){
        	if(op.get(i)=='*'){
        		op.remove(i);
        		lis.set(i, lis.get(i)*lis.get(i+1));
        		lis.remove(i+1);
        		i--;
        	}
        	else if(op.get(i)=='/'){
        		op.remove(i);
        		lis.set(i, lis.get(i)/lis.get(i+1));
        		lis.remove(i+1);
        		i--;
        	}
        }
        int res = lis.get(0);
        for(int i = 0; i< op.size(); i++){
        	if(op.get(i)=='+') res+=lis.get(i+1);
        	else if(op.get(i)=='-') res-=lis.get(i+1);
        }
        System.out.println(lis);
        System.out.println(op);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculatorII test = new BasicCalculatorII();
		String s = "3*0";
		int res = test.calculate(s);
		System.out.println(res);
	}

}
