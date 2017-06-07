
public class FirstUniqueChar {
	public int firstUniqChar(String s) {
        int n = s.length();
        char[] cs = s.toCharArray();
        boolean flag = true;
        int r;
        for(int i = 0; i < n; i++ ){
        	for(int j = 0; j < n; j++){
        		if(i != j && cs[i] == cs[j]) flag = false;
        	}
        	if(flag == true) return i;
        	else if(flag == false) flag = true;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUniqueChar test = new FirstUniqueChar();
		System.out.println(test.firstUniqChar("lovel"));
	}

}
