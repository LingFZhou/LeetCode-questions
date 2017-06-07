import java.util.ArrayList;
//2017-1-30
public class FlipGame2 {
	public boolean canWin(String s) {
		if(s.length()<2||s==null) return false;
		for(int i = 0; i < s.length(); i++){
			if(s.startsWith("++",i)){
				String t = s.substring(0,i)+"--"+s.substring(i+2);
			
				if(!canWin(t)) return true;
			}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "++++";
		FlipGame2 test = new FlipGame2();
		System.out.println(test.canWin(s));
		
	}

}
