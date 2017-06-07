
public class hammingdistance {
	public int hamdis(int x, int y){
		return Integer.bitCount(x^y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hammingdistance test = new hammingdistance();
		System.out.println(test.hamdis(1, 4));
		
	}

}