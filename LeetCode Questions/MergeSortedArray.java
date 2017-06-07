import java.util.Arrays;
//2017-2-7
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		while(n>0) nums1[m+n-1] = (m==0||nums1[m-1]<nums2[n-1])?nums2[--n]:nums1[--m];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray test = new MergeSortedArray();
		int[] nums1 = new int[10];
		for(int i = 0; i < 4; i++){
			nums1[i] = i*2+1;
		}
		int[] nums2 = new int[10];
		for(int i = 0; i < 3; i++){
			nums2[i] = i*2;
		}
		
		test.merge(nums1, 4, nums2, 3);
		for(int nnnn : nums1) System.out.println(nnnn);
	}

}
