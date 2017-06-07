import java.util.*;
//2017-4-13
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
    	List<List<String>> list = new ArrayList<>();
    	List<String> lis = new ArrayList<>();
    	helper(list,lis,s,0,0);
    	return list;
    }
    public void helper(List<List<String>> list, List<String> lis, 
    		String s, int index,int len){
    	if(index>=s.length()){
    		if(len==s.length()&&lis.size()>0)list.add(lis);
    		return;
    	}
    	for(int i = index; i < s.length();i++){
    		StringBuilder temp = new StringBuilder();
    		String t = s.substring(index,i+1);
    		temp.append(t);
        	if(t.equals(temp.reverse().toString())){
        		lis.add(t);
        		len+=t.length();
        		helper(list,new ArrayList(lis),s,i+1,len);
        		len-=t.length();
        		if(lis.size()>=1) lis.remove(lis.size()-1);
        	}
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioning test = new PalindromePartitioning();
		String s = "aab";
		List<List<String>> list = test.partition(s);
		System.out.println(list);
		
	}

}
