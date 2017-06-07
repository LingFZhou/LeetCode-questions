import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet re = new HashSet();
        
        int n = 0;
        for(int i = 0; i <= nums1.length - 1; i++){
        	for(int j = 0; j <= nums2.length - 1; j++){
        		if(nums1[i] == nums2[j] ){
        			re.add(nums1[i]);
        		}
        	}
        }
        int size = re.size();
        int index = 0;
        int[] realresult = new int[size];
        Iterator iterator=re.iterator();
		while(iterator.hasNext()){
			realresult[index] = (int) iterator.next();
			index++;
		}
		return realresult;
        
    }
}
