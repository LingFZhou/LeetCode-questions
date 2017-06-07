import java.util.ArrayList;
import java.util.Arrays;
//2017-1-31
public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
    	if(nums1.length == 0 || nums2.length == 0) return new int[0];
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	ArrayList<Integer> arr = new ArrayList<>();
    	int a1 = nums1.length;
    	int a2 = nums2.length;
    	int j = 0;
    	int m = 0;
    	if(a1>=a2){
	    	for(int i = 0; i < a1; i++){
	    		if(j<a2){
		    		if(nums1[i] == nums2[j]){
		    			arr.add(nums1[i]);
		    			j++;
		    			m = j;
		    		}
		    		
		    		else if(nums1[i] != nums2[j]){
		    			if(m < a2){
		    				for(int ii = m; ii < a2; ii++){
			    				if(nums1[i] == nums2[ii]){
			    					arr.add(nums1[i]);
			    					j = m =ii + 1;
			    					break;
			    				}
			    			}
		    			}
		    			
		    			
		    		}
	    		}
	    	}
    	}
    	else if(a1<a2){
    		for(int i = 0; i < a2; i++){
	    		if(j<a1){
		    		if(nums2[i] == nums1[j]){
		    			arr.add(nums2[i]);
		    			j++;
		    			m = j;
		    		}
		    		
		    		else if(nums2[i] != nums1[j]){
		    			if(m < a1){
		    				for(int ii = m; ii < a1; ii++){
			    				if(nums2[i] == nums1[ii]){
			    					arr.add(nums2[i]);
			    					j = m =ii + 1;
			    					break;
			    				}
			    			}
		    			}
		    			
		    			
		    		}
	    		}
	    	}

    	}
    	int[] result = new int[arr.size()];
    	for(int k = 0; k < arr.size(); k++){
    		result[k] = arr.get(k);
    	}
    	return result;
    	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionofTwoArraysII test = new IntersectionofTwoArraysII();
		int[] nums1 = {-1,1,2,3};
		int[] nums2 = {1,-1,-1};
		int[] r = test.intersect(nums1, nums2);
		for(int i = 0; i < r.length; i++){
			System.out.println(r[i]);
		}
	}

}
