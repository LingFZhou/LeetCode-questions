//2017-3-14
public class ReconstructOriginalDigitsfromEnglish {
    public String originalDigits(String s) {
        int[] ch = new int[26];
        for(int i = 0; i < s.length(); i++){
        	char tc = s.charAt(i);
        	ch[tc-'a']++;
        }
        int nzero = ch[25];
        int ntwo = ch[22];
        int nfour = ch[20];
        int nsix = ch[23];
        int neight = ch[6];
        int nthree = ch[19]-ntwo-neight;
        int nfive = ch[5]-nfour;
        int nseven = ch[18]-nsix;
        int none = ch[14]- nzero-ntwo-nfour;
        int nnine = ch[8]-nfive-nsix-neight;
        String res  = "";
        for(int i = 0; i < nzero; i++) res+='0';
        for(int i = 0; i < none; i++) res+='1';
        for(int i = 0; i < ntwo; i++) res+='2';
        for(int i = 0; i < nthree; i++) res+='3';
        for(int i = 0; i < nfour; i++) res+='4';
        for(int i = 0; i < nfive; i++) res+='5';
        for(int i = 0; i < nsix; i++) res+='6';
        for(int i = 0; i < nseven; i++) res+='7';
        for(int i = 0; i < neight; i++) res+='8';
        for(int i = 0; i < nnine; i++) res+='9';
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReconstructOriginalDigitsfromEnglish test = new ReconstructOriginalDigitsfromEnglish();
		String s = "";
		String res = test.originalDigits(s);
		System.out.println(res);
	}

}
