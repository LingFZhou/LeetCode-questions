
public class GetSum {
	public int getSum(int a, int b){
		if(b == 0) return a;
		else return getSum(a ^ b, (a & b) << 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSum test = new GetSum();
		System.out.println(test.getSum(12, 23));
		
	}

}
