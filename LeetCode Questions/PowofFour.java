
public class PowofFour {
	public boolean isPowerOfFour(int num) {
		System.out.println(Integer.toString(num,4));
        return Integer.toString(num,4).matches("10*");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowofFour test = new PowofFour();
		System.out.println(test.isPowerOfFour(1));
	}

}
