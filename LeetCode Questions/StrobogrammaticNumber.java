//2017-2-2
//for (int i=0, j=num.length()-1; i <= j; i++, j--)
//        if (!"00 11 88 696".contains(num.charAt(i) + "" + num.charAt(j)))
//            return false;
//    return true;
public class StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		if(num.length() == 0) return false;
		if(num.length() == 1){
			if(num.equals("1") || num.equals("0") || num.equals("8")) return true;
			else return false;
		}
        StringBuilder  rnum = new StringBuilder(num);
        rnum.reverse();
        for(int i = 0; i < num.length(); i++){
        	if(num.charAt(i) == '6' && rnum.charAt(i) != '9') return false;
        	if(num.charAt(i) == '9' && rnum.charAt(i) != '6') return false;
        	if(num.charAt(i) == '8' && rnum.charAt(i) != '8') return false;
        	if(num.charAt(i) == '1' && rnum.charAt(i) != '1') return false;
        	if(num.charAt(i) == '0' && rnum.charAt(i) != '0') return false;
        	if(num.charAt(i) == '2'||num.charAt(i) == '3'
        			||num.charAt(i) == '4'||num.charAt(i) == '5'||num.charAt(i) == '7')
        		return false;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "13";
		StrobogrammaticNumber test = new StrobogrammaticNumber();
		boolean flag = test.isStrobogrammatic(num);
		System.out.println(flag);
	}

}
