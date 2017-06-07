//2017-2-11
public class Base7 {
    public String convertTo7(int num) {
    	int ind = 0;
    	String str = "";
    	if(num == 0) return str + 0;
    	if(num<0){
    		str += "-";
    		num = -num;
    	}
        while(num >= Math.pow(7, ind)) ind++;
        int i = ind-1;
        int j = 0;
        while(i>-1){
        	j = (int) (num/Math.pow(7, i));
        	num = (int) (num-j*Math.pow(7, i));
        	str += j;
        	i--;
        }
        
        return str;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base7 test = new Base7();
		String n = test.convertTo7(-2);
		System.out.println(n);
	}

}
