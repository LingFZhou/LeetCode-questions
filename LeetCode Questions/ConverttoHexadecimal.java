//2017-1-31
public class ConverttoHexadecimal {
    public String toHex(int num) {
        String[] map = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        if(num == 0) return "0";
        String s = "";
        while(num != 0){
        	s = map[(num&15)] + s;
        	num = num >>> 4;
        }
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConverttoHexadecimal test = new ConverttoHexadecimal();
		String r = test.toHex(26);
		System.out.println(r);
	}

}
