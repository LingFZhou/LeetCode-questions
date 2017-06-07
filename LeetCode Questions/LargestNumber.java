import java.util.Arrays;
import java.util.*;
//2017-4-24
public class LargestNumber {
    public String largestNumber(int[] nums) {
    	String[] st = new String[nums.length];
    	for(int i = 0; i < nums.length; i++){
    		st[i] = String.valueOf(nums[i]);
    	}
    	Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1+o2;
				String s2 = o2+o1;
				return s2.compareTo(s1);
			}
		};
		Arrays.sort(st, comp);
		if(st[0].charAt(0)=='0') return "0";
		String res = "";
		for(String s : st) res+=s;
		return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber test = new LargestNumber();
		int[] nums = {2,9,33};
		String res = test.largestNumber(nums);
		System.out.println(res);
	}

}
