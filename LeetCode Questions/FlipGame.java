import java.awt.List;
import java.util.ArrayList;
//2017-1-30
public class FlipGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "++++";
		ArrayList lis = new ArrayList();
		int i = -1;
		
		while((i = s.indexOf("++", i+1))>=0){
			lis.add(s.substring(0, i)+"--"+s.substring(i+2));
		}
		System.out.println(lis);
	}

}
