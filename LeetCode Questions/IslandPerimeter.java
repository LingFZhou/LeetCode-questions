//2017-1-30
public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
        int i = grid.length;
        int onecount = 0;
        int neighborcount = 0;
        for(int j = 0; j < i; j++){
        	for(int k = 0; k < grid[j].length; k++){
        		if(grid[j][k]==1){
        			onecount++;
        			if(j>=1) 
        				neighborcount = grid[j][k]==grid[j-1][k]?
        						neighborcount+1:neighborcount;
        			if(k>=1)
        				neighborcount = grid[j][k]==grid[j][k-1]?
        						neighborcount+1:neighborcount;
        			
        		}
        	}
        }
        return 4*onecount-2*neighborcount;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0},
		                {1,1,1,0},
		                {0,1,0,0},
		                {1,1,0,0}};
		
		IslandPerimeter test = new IslandPerimeter();
		System.out.println(test.islandPerimeter(grid));
	}

}
