
public class ConstructtheRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = 9;
		int[] r = new int[2];
		for(int i = (int) Math.sqrt(area); i > 0; i--){
			if(area%i==0) {
				r[0] = i;
				r[1] = area/i;
				break;
			}
		}
		System.out.println(9%3);
		System.out.println("result "+ r[0]+"and "+r[1]);
	}

}
