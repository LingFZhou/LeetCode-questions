//2017-2-2
public class NumberofSegmentsinaString {
	public int countSegments(String s) {
        char[] cs = s.toCharArray();
        int count = 0;
        for(int  i =0; i < cs.length - 1; i++){
            if(cs[i] != ' '&&cs[i + 1] == ' ') count ++;
        }
        if(cs.length == 0) return 0;
        if(cs[cs.length-1] != ' ') count ++;
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abd sfd  s ";
		NumberofSegmentsinaString test = new NumberofSegmentsinaString();
		int n = test.countSegments(s);
		System.out.println(n);
	}

}
