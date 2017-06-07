import java.util.*;
//2017-5-5
public class MergeIntervals {
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> res = new ArrayList<>();
    	if(intervals.size()<2) return intervals;
    	Comparator<Interval> cmp = new Comparator<Interval>() {
			
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start-o2.start;
			}
		};
		Comparator<Interval> cmp2 = new Comparator<Interval>(){
			@Override
			public int compare(Interval o1, Interval o2){
				return o2.start-o1.start;
			}
		};
		Collections.sort(intervals, cmp);
		int left = intervals.get(0).start;
		int right = intervals.get(0).end;
		for(int i = 1; i < intervals.size(); i++){
			if(intervals.get(i).start>right){
				res.add(new Interval(left,right));
				left = intervals.get(i).start;
				right = intervals.get(i).end;
			}
			else if(intervals.get(i).start<=right){
				if(intervals.get(i).end>right) right = intervals.get(i).end;
			}
		}
		res.add(new Interval(left,right));
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
