import java.util.*;
//2017-3-11
public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
    	 List<Integer> list = new ArrayList<>();
    	 for(String s:timePoints){
    		 list.add(Integer.valueOf(s.substring(0,2))*60+Integer.valueOf(s.substring(3)));
    		 list.add(Integer.valueOf(s.substring(0,2))*60+24*60+Integer.valueOf(s.substring(3)));
    	 }
    	 System.out.println(list);
    	 Collections.sort(list);
    	 int min = Integer.MAX_VALUE;
    	 for(int i = 0; i < list.size() - 1; i++){
    		 min = Math.min(list.get(i+1)-list.get(i), min);
    	 }
    	 System.out.println(list);
    	 
    	 return min;
    	 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumTimeDifference test = new MinimumTimeDifference();
		List<String> timePoints = new ArrayList<>();
		timePoints.add("01:39");
		timePoints.add("10:26");
		timePoints.add("21:43");
		int res = test.findMinDifference(timePoints);
		System.out.println(res);
	}

}
