import java.util.*;
//2017-3-28
public class NonoverlappingIntervals {
	public class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
	}
	
    public int eraseOverlapIntervals(Interval[] intervals) {
    	if(intervals.length ==0) return 0;
        for(int i = intervals.length-1; i >0; i--){
        	for(int j = 0; j < i; j++){
        		if(intervals[j].end>intervals[j+1].end){
        			Interval temp = intervals[j];
            		intervals[j] = intervals[j+1];
            		intervals[j+1] = temp;
        		}
        	}	
        }
        int res = 1;
        List<Interval> list = new ArrayList<>();
        for(Interval i: intervals) list.add(i); 
        int end = list.get(0).end;
        for(int i = 1; i < list.size(); i++){
        	if(list.get(i).start>=end) {
        		res++;
        		end=list.get(i).end;
        	}
        }  
        return list.size()-res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonoverlappingIntervals test = new NonoverlappingIntervals();
		Interval i1 = test.new Interval(2,4);
		Interval i2 = test.new Interval(3,5);
		Interval i3 = test.new Interval(4,6);
		Interval i4 = test.new Interval(5,7);
		//Interval i5 = test.new Interval(1,5);
		Interval[] in = {i1,i2,i3,i4};
		int res = test.eraseOverlapIntervals(in);
		System.out.println(res);
		
	}

}
