import java.util.*;
//2017-4-4
public class BullsandCows {
    public String getHint(String secret, String guess) {
        Map<Character,Integer> map = new HashMap<>();
        int bull = 0, cow = 0;
        char[] chs = secret.toCharArray();
        char[] chg = guess.toCharArray();
        for(char c:chs) map.put(c, map.getOrDefault(c, 0)+1);
        for(char c:chg){
        	if(map.containsKey(c)&&map.get(c)>0){
        		cow++;
        		int temp = map.get(c);
        		map.put(c, temp-1);
        	}
        }
        for(int i = 0; i < chs.length; i++){
        	if(chs[i]==chg[i]) bull++;
        }
        cow = cow-bull;
        String res = "";
        res+=bull+"A"+cow+"B";
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BullsandCows test = new BullsandCows();
		String secret = "1123";
		String guess = "0111";
		String res = test.getHint(secret, guess);
		System.out.println(res);
	}

}
