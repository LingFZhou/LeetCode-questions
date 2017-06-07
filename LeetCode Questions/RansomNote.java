import java.util.Arrays;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length() != 0 && magazine.length() == 0) return false;
		if(ransomNote.length() == 0) return true;
		char[] cran = new char[ransomNote.length()];
		char[] cmag = new char[magazine.length()];
		cran = ransomNote.toCharArray();
		cmag = magazine.toCharArray();
		Arrays.sort(cran);
		Arrays.sort(cmag);
		System.out.println(cran);
		System.out.println(cmag);
		int r = 0;
		boolean flag = true;
		for(int i = 0; i <= ransomNote.length() - 1; i++){
			for(int j = r; j <= magazine.length() - 1; j++){				
				if(cran[i] == cmag[j]){
					r = j + 1;
					if(i != ransomNote.length() - 1 && r >= magazine.length()) flag = false;
					break;
				}
				else if(cran[i] != cmag[j] && j == magazine.length() - 1) flag = false;
			}
		}
		return flag;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNote test = new RansomNote();
		System.out.println(test.canConstruct("djfjfhjf",
				"aaigcbiafifghhdihcfdjjej"));
	}

}
