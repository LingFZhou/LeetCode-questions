import java.util.*;
//2017-4-3
public class GeneralizedAbbreviation {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();
        helper(word,0,"",0,res);
        return res;
    }
    public void helper(String word,int index,String cur,int count,List<String> res){
    	if(index==word.length()){
    		if(count>0)  cur+=count;
    		res.add(cur);
    	}
    	else{
    		helper(word,index+1,cur,count+1,res);
    		helper(word,index+1,cur+(count>0?count:"")+word.charAt(index),0,res);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
