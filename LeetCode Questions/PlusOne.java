import java.util.ArrayList;
//2017-2-2
public class PlusOne {
	public int[] plusOne(int[] digits) {
//		int n = digits.length;
//	    for(int i=n-1; i>=0; i--) {
//	        if(digits[i] < 9) {
//	            digits[i]++;
//	            return digits;
//	        }    
//	        digits[i] = 0;
//	    }
//	    int[] newNumber = new int [n+1];
//	    newNumber[0] = 1;
//	    return newNumber;
		int carry = 0;
		int len = digits.length;
		ArrayList<Integer> sum = new ArrayList<>();
		if(digits[len - 1] + 1 == 10) {
			sum.add(0);
			carry = 1;
		}
		else sum.add(digits[len - 1] + 1);
        for(int i = digits.length - 2; i >= 0; i--){
        	int n = (digits[i] + carry)%10;
        	carry = (digits[i] + carry)/10;
        	sum.add(n);
        }
        if(carry == 1) sum.add(1);
        int[] result = new int[sum.size()];
        for(int i = 0; i < sum.size(); i++){
        	result[i] = sum.get(sum.size() - i - 1);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne test = new PlusOne();
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		int[] result = test.plusOne(digits);
		for(int n : result)
		System.out.println(n);
	}

}
