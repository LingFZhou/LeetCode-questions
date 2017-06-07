import java.util.*;
//2017-2-4
public class KeyboardRow {
	public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> list = new ArrayList();
        for(int i = 0; i < words.length; i++){
        	boolean flag1 = true;
        	for(int j = 0; j < words[i].length(); j++){
        		if(s1.indexOf(words[i].charAt(j))==-1) flag1 = false;
        	}
        	if(flag1 == true) list.add(words[i]);
        	flag1 = true;
        	for(int j = 0; j < words[i].length(); j++){
        		if(s2.indexOf(words[i].charAt(j))==-1) flag1 = false;
        	}
        	if(flag1 == true) list.add(words[i]);
        	flag1 = true;
        	for(int j = 0; j < words[i].length(); j++){
        		if(s3.indexOf(words[i].charAt(j))==-1) flag1 = false;
        	}
        	if(flag1 == true) list.add(words[i]);
        }
        String[] s = new String[list.size()];
        for(int k = 0; k < s.length; k++){
        	s[k] = list.get(k);
        }
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyboardRow test = new KeyboardRow();
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String s[] = test.findWords(words);
		for(String n : s) System.out.println(n);
	}

}
