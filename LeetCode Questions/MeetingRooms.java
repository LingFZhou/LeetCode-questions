//2017-1-31
public class MeetingRooms {
	public class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
	}
	public boolean canAttendMeetings(Interval[] intervals) {
        int[] st = new int[intervals.length];
        int[] en = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
        	st[i] = intervals[i].start;
        	en[i] = intervals[i].end;
        }
        for(int i = 0; i < intervals.length; i++){
        	for(int j = 0; j < intervals.length; j++){
        		if( i != j){
        			if(st[i]<=st[j]&&en[i]>st[j]) return false;
        		}
        	}
        }
        return true;
    }
	static Interval[] interval = new Interval[2];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeetingRooms test = new MeetingRooms();
		interval[0] = test.new Interval(1,3);
		interval[1] = test.new Interval(2,3);
		
		
		boolean flag = test.canAttendMeetings(interval);
		System.out.println(flag);
	}

}
