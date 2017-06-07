import java.util.*;
//2017-2-11
public class ReversePairs {
	public int reversePairs(int[] nums) {
		int n = nums.length, res = 0;
		if (n <2) return res;
		List<Long> list = new ArrayList<>();
		list.add(2*(long)nums[n-1]);
		for (int j = n-2; j >= 0; j--) {
			res += bs((long)nums[j], list);
			list.add(bs(2*(long)nums[j], list), 2*(long)nums[j]);
		}
		return res;
	}
		
	// binary search
	private int bs (long val, List<Long> list) {
		int l = 0, r = list.size()-1;
		while (l<=r) {
			int m = (l+r)/2;
			if (list.get(m) < val) l = m+1;
			else r = m-1;
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversePairs test = new ReversePairs();
		int[] nums = {2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647};
		int n = test.reversePairs(nums);
		System.out.println(n);
	}

}
