//2017-1-31
public class AddBinary {
    public String addBinary(String a, String b) {
    	int carry = 0;
    	StringBuilder sb = new StringBuilder();
        for(int i = a.length()-1, j = b.length()-1;i>=0||j>=0||carry==1; i--,j--){
        	int x = i<0?0:a.charAt(i) - '0';
        	int y = j<0?0:b.charAt(j) - '0';
        	sb.append((x + y + carry)%2);
        	carry = (x + y + carry)/2;
        }
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11";
		String b = "1";
		AddBinary test = new AddBinary();
		String r = test.addBinary(a, b);
		System.out.println(r);
	}

}
