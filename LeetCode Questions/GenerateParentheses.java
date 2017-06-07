import java.util.*;
//2017-5-16
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
    	List<String> list = new ArrayList<>();
    	helper(list,"",0,0,n);
    	return list;
    }
    public void helper(List<String> list, String s, int left, int right, int len){
    	if(s.length()==2*len){
    		list.add(s);
    		return;
    	}
    	if(left<len) helper(list,s+"(",left+1,right,len);
    	if(right<left) helper(list,s+")",left,right+1,len);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses test = new GenerateParentheses();
		System.out.println(test.generateParenthesis(1));
	}

}
