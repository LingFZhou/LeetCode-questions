import java.util.Arrays;
//2017-1-31
public class FirstUnique {
	public int firstUniqChar(String s) {
		char[] cs = s.toCharArray();
		Arrays.sort(cs);
		String m = "";
		if(cs.length == 0) return -1;
		if(cs.length == 1) return 0;
		for(int i = 0; i < cs.length; i++){
			if(i == 0) {if(cs[i] != cs[i+1]) m += cs[i];}
			if(i != 0 && i != cs.length -1) 
				{if(cs[i] != cs[i - 1] && cs[i] != cs[i+1]) m += cs[i];}
			if(i == cs.length - 1) {if(cs[i] != cs[i-1]) m+= cs[i];}
		}
		if(m.length() == 0) return -1;
		int[] pos = new int[m.length()];
		for(int j = 0; j < pos.length; j++){
			pos[j] = s.indexOf(m.charAt(j));
		}
		Arrays.sort(pos);
		for(int n : pos)
		System.out.println(n);
		return pos[0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		FirstUnique test = new FirstUnique();
		int r = test.firstUniqChar(s);
		System.out.println(r);
	}

}
