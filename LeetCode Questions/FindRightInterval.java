import java.util.*;
//2017-2-15
public class FindRightInterval {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
    public int[] findRightInterval(Interval[] intervals) {
    	Map<Integer,Integer> map = new HashMap<>();
    	List<Integer> list = new ArrayList();
    	int[] res = new int[intervals.length];
    	for(int i = 0; i < intervals.length;i++){
    		map.put(intervals[i].start, i);
    		list.add(intervals[i].start);
    	}
    	Collections.sort(list);
    	for(int i = 0; i < intervals.length;i++){
    		if(binarysearch(list,intervals[i].end)>=intervals[i].end)
    			res[i] = map.get(binarysearch(list,intervals[i].end));
    		else res[i] = -1;
    	}
    	return res;
    	
    	
    }
    public int binarysearch(List<Integer> list, int end){
    	int left = 0, right = list.size()-1;
    	while(left<right){
    		int mid = left + (right - left)/2;
    		if(list.get(mid)<end) left = mid+1;
    		else right = mid;
    	}
    	return list.get(left);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindRightInterval test = new FindRightInterval();
		Interval interval1 = test.new Interval(1,4);
		Interval interval2 = test.new Interval(2,3);
		Interval interval3 = test.new Interval(3,4);
		Interval[] interval = {interval1,interval2,interval3};
		int[] res = test.findRightInterval(interval);
		for(int n : res) System.out.println(n);
	}

}
