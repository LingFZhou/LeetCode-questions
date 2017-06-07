
public class TwoSum {
	public int[] twoSum(int[] numbers, int target){
		int length = numbers.length - 1;
		int[] result = new int[2];
		int i = 0;
		int j = length;
		while(true){
			if(numbers[i] + numbers[j] > target) j--;
			if(numbers[i] + numbers[j] < target) i++;
			if(numbers[i] + numbers[j] == target){
				result[0] = i + 1;
				result[1] = j + 1;
				break;
			}
		}
		System.out.println(result[0]);
		System.out.println(result[1]);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum test = new TwoSum();
		int[] numbers = {2,7,11,15};
		System.out.println(test.twoSum(numbers, 26));
	}

}
