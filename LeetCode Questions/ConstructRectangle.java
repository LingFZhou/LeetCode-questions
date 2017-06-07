//2017-1-30
public class ConstructRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = 9;
		int[] r = new int[2];
		for(int i = (int)Math.sqrt(area); i > 0; i--){
			if(area % i == 0){
				r[1] = i;
				r[0] = area / i;
				break;
			}
		}
		System.out.println("result: " + r[0] + " and " + r[1]);
	}

}
