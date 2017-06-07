//2017-1-30
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   aaa   ";
		
		if(s.length() == 0) System.out.println(0);
		String[] sa = s.split(" ");
		if(sa.length == 0) System.out.println(0);
		
		String ls = sa[sa.length - 1];
	
		System.out.println(ls.length());
		
	}

}
