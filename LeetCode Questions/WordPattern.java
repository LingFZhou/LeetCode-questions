import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
//2017-2-2
public class WordPattern {
	//index.put(key,value)return last value of key
//	String[] words = str.split(" ");
//    if (words.length != pattern.length())
//        return false;
//    Map index = new HashMap();
//    for (Integer i=0; i<words.length; ++i)
//        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
//            return false;
//    return true;
	public boolean wordPattern(String pattern, String str) {
		String[] cp = pattern.split("");
        String[] cs = str.split(" ");
        HashMap<String,String> table = new HashMap();
        HashMap<String,String> table2 = new HashMap();
        if(cs.length != cp.length) return false;
        if(cp[0] == "" && cs.length != 0) return false;
        if(cs.length == cp.length){
        	table.put(cp[0], cs[0]);
        	table2.put(cs[0], cp[0]);
        	for(int i = 1; i < cs.length; i++){
        		if((table.containsKey(cp[i])) 
        				&& (!table.get(cp[i]).equals(cs[i]))) return false;
        		table.put(cp[i], cs[i]);
        	}
        	for(int i = 1; i < cs.length; i++){
        		if((table2.containsKey(cs[i])) 
        				&& (!table2.get(cs[i]).equals(cp[i]))) return false;
        		table.put(cs[i], cp[i]);
        	}
        	
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern = "";
		String str = "beef";
		WordPattern test = new WordPattern();
		boolean flag = test.wordPattern(pattern, str);
        System.out.println(flag);
        
	}

}
