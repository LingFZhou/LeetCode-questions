//2017-1-31
public class PaintHouse {
	public int minCost(int[][] costs) {
        if(costs.length == 0) return 0;
        int lastR = costs[0][0];
        int lastB = costs[0][1];
        int lastG = costs[0][2];
        for(int i = 1; i < costs.length; i++){
        	int curR = Math.min(lastG, lastB) + costs[i][0];
        	int curB = Math.min(lastR, lastG) + costs[i][1];
        	int curG = Math.min(lastB, lastR) + costs[i][2];
        	lastR = curR;
        	lastB = curB;
        	lastG = curG;
        }
        return Math.min(Math.min(lastG, lastR), lastB);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] costs = {{1,2,3}};
		PaintHouse test = new PaintHouse();
		int m = test.minCost(costs);
		System.out.println(m);
	}

}
