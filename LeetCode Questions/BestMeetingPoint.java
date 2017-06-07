import java.util.Arrays;
//2017-3-10
public class BestMeetingPoint {
    public int minTotalDistance(int[][] grid) {
    	int len = 0;
    	for(int i = 0; i < grid.length;i++){
    		for(int j = 0; j < grid[0].length; j++){
    			if(grid[i][j]==1) len++;
    		}
    	}
    	int grid1[][] = new int[len][2];
    	int x = 0;
    	for(int i = 0; i < grid.length;i++){
    		for(int j = 0; j < grid[0].length; j++){
    			if(grid[i][j]==1) {
    				grid1[x][0] = i;
    				grid1[x][1] = j;
    				x++;
    			}
    		}
    	}
        int[] gx = new int[len];
        int[] gy = new int[len];
        for(int i = 0; i < len; i++){
        	gx[i] = grid1[i][0];
        	gy[i] = grid1[i][1];
        }
        Arrays.sort(gx);
        Arrays.sort(gy);
        int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
        for(int i = gx[0]; i <= gx[len-1]; i++){
        	int curminx = 0;
        	for(int j = 0; j < len; j++){
        		curminx += Math.abs(gx[j]-i);
        	}
        	minx = Math.min(minx, curminx);
        }
        for(int i = gy[0]; i <= gy[len-1]; i++){
        	int curminy = 0;
        	for(int j = 0; j < len; j++){
        		curminy += Math.abs(gy[j]-i);
        	}
        	miny = Math.min(miny, curminy);
        }
       
	
        return minx + miny;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestMeetingPoint test = new BestMeetingPoint();
		int[][] grid = {{0,0},{0,1},{1,0}};
		int res = test.minTotalDistance(grid);
		System.out.println(res);
	}

}
