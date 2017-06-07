//2017-3-25
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
    	String res = "";
        int indexa = a.indexOf('+');
        int indexb = b.indexOf('+');
        String na1 = a.substring(0, indexa);
        String nb1 = b.substring(0, indexb);
        String na2 = a.substring(indexa+1,a.length()-1);
        String nb2 = b.substring(indexb+1,b.length()-1);
        int mua1 = 0,mub1 = 0, mua2 = 0, mub2 = 0;
        if(na1.charAt(0)=='-'){
        	int i = 1;
        	while(i<na1.length()) mua1 = mua1*10+na1.charAt(i++)-'0';
        	mua1 = -mua1;
        }
        else if(na1.charAt(0)!='-'){
        	int i = 0;
        	while(i<na1.length()) mua1 = mua1*10+na1.charAt(i++)-'0';
        }
        if(nb1.charAt(0)=='-'){
        	int i = 1;
        	while(i<nb1.length()) mub1 = mub1*10+nb1.charAt(i++)-'0';
        	mub1 = -mub1;
        }
        else if(nb1.charAt(0)!='-'){
        	int i = 0;
        	while(i<nb1.length()) mub1 = mub1*10+nb1.charAt(i++)-'0';
        }
        if(na2.charAt(0)=='-'){
        	int i = 1;
        	while(i<na2.length()) mua2 = mua2*10+na2.charAt(i++)-'0';
        	mua2 = -mua2;
        }
        else if(na2.charAt(0)!='-'){
        	int i = 0;
        	while(i<na2.length()) mua2 = mua2*10+na2.charAt(i++)-'0';
        }
        if(nb2.charAt(0)=='-'){
        	int i = 1;
        	while(i<nb2.length()) mub2 = mub2*10+nb2.charAt(i++)-'0';
        	mub2 = -mub2;
        }
        else if(nb2.charAt(0)!='-'){
        	int i = 0;
        	while(i<nb2.length()) mub2 = mub2*10+nb2.charAt(i++)-'0';
        }
        int resa = mua1*mub1-mua2*mub2;
        int resb = mua2*mub1+mua1*mub2;
        String sresa = String.valueOf(resa);
        String sresb = String.valueOf(resb);
        res = res + sresa + '+' + sresb + 'i';
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumberMultiplication test = new ComplexNumberMultiplication();
		String a = "1+-1i";
		String b = "1+-1i";
		String res = test.complexNumberMultiply(a, b);
		System.out.println(res);
	}

}
