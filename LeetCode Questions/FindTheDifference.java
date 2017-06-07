import java.util.Arrays;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		char[] cs = new char[s.length()];
		char[] ct = new char[t.length()];
		boolean flag = true;
		char r = 0;
		cs = s.toCharArray();
		ct = t.toCharArray();
		Arrays.sort(cs);
		Arrays.sort(ct);
		
		for(int i = 0; i <= s.length()-1; i++){
			if(cs[i] != ct[i]){
				flag = false;
				r = ct[i];
				break;
			}
		}
		if(flag == false) {System.out.println(r); return r;}
		else {System.out.println(ct[t.length()-1]); return ct[t.length()-1];}
	}

	public static void main(String[] args){
		FindTheDifference test = new FindTheDifference();
		test.findTheDifference("ssfteasdxdgsgsagsfeghhzzdefsa", "ssfteasdxdgtsgsagsfeghhzzdefsa");
		
	}
}
