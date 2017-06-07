//2017-5-6
public class SquirrelSimulation {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int numnuts = nuts.length;
        int sumdis = 0;
        for(int i = 0; i < numnuts; i++){
        	sumdis += Math.abs(tree[0]-nuts[i][0])+Math.abs(tree[1]-nuts[i][1]);
        }
        sumdis*=2;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < numnuts; i++){
        	int dis = Math.abs(squirrel[0]-nuts[i][0])+Math.abs(squirrel[1]-nuts[i][1])+
        			Math.abs(tree[0]-nuts[i][0])+Math.abs(tree[1]-nuts[i][1]);
        	int temp = sumdis-2*(Math.abs(tree[0]-nuts[i][0])+Math.abs(tree[1]-nuts[i][1]))+dis;
        	res = Math.min(res, temp) ;
        }
        
        
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquirrelSimulation test = new SquirrelSimulation();
		int[] tree = {3,2};
		int[] squirrel = {0,1};
		int[][] nuts = {{2,0},{4,1},{0,4},{1,3},{1,0},{3,4},{3,0},{2,3},
				{0,2},{0,0},{2,2},{4,2},{3,3},{4,4},{4,0},{4,3},{3,1},{2,1},{1,4},{2,4}
		};
		System.out.println(test.minDistance(5, 5, tree, squirrel, nuts));
	}

}
