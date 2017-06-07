import java.util.*;


//2017-2-4
public class IPO {
	public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
//		PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
//        PriorityQueue<int[]> pqPro  = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
//        
//        for (int i = 0; i < Profits.length; i++) {
//            pqCap.add(new int[] {Capital[i], Profits[i]});
//        }
//        
//        for (int i = 0; i < k; i++) {
//            while (!pqCap.isEmpty() && pqCap.peek()[0] <= W) {
//                pqPro.add(pqCap.poll());
//            }
//            
//            if (pqPro.isEmpty()) break;
//            
//            W += pqPro.poll()[1];
//        }
//        
//        return W;
		
		
//		Arrays.sort(intervals, new Comparator<Interval>() {
//	        @Override
//	        public int compare(Interval o1, Interval o2) {
//	            if (o1.end != o2.end) return o1.end - o2.end;  //first sort by end
//	            return o2.start - o1.start;  //second sort by start
//	        }
//	    });
		if(k == 0||Profits.length == 0) return W;
		int index = 0;
		int curpro = 0;
		for(int i = 0; i < Capital.length; i++){
			if(W>=Capital[i]){
				index = Math.max(curpro, Profits[i]) == curpro? index: i;
				curpro = Math.max(curpro, Profits[i]);	
			}
		}
		Capital[index] = Integer.MAX_VALUE;
		Profits[index] = Integer.MAX_VALUE;
		W += curpro;
        return findMaximizedCapital(k-1, W, Profits, Capital);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPO test = new IPO();
		int[] Profits = {1,2,3};
		int[] Capital = {1,1,2};
		int n = test.findMaximizedCapital(2, 2, Profits, Capital);
		System.out.println(n);
	}

}
