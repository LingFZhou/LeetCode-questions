import java.util.PriorityQueue;
//2017-3-16
public class MinimumNumberofArrowstoBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0||points[0].length == 0) return 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
        for(int i = 0; i < points.length; i++){
        	pq.add(points[i]);
        }
        
        int count = 1;
        int arrow = pq.poll()[1];
        for(int i = 1; i < points.length; i++){
        	int[] ballon = pq.poll();
        	if(ballon[0]<=arrow){
        		arrow = Math.min(arrow,ballon[1]);
        	}
        	else if(ballon[0]>arrow){
        		count++;
        		arrow = ballon[1];
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberofArrowstoBurstBalloons test = new MinimumNumberofArrowstoBurstBalloons();
		int[][] points = {{10,16}, {2,8}, {1,6}, {7,12}};
		int count = test.findMinArrowShots(points);
		System.out.println(count);
	}

}
