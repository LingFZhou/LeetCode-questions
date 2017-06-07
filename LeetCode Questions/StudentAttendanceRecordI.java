import java.util.*;
//2017-4-15
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
    	if(s.length()==0) return false;
    	int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++){
        	if(s.charAt(i)=='A') count++;
        	if(count>1) return false;
        	if(s.charAt(i)=='L'&&i<s.length()-2){
        		if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2))
        			return false;
        	}
        }
        
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAttendanceRecordI test = new StudentAttendanceRecordI();
		String s = "PPALLL";
		boolean flag = test.checkRecord(s);
		System.out.println(flag);
	}

}
