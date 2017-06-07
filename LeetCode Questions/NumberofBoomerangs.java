import java.util.HashMap;
import java.util.Map;
//2017-1-31
public class NumberofBoomerangs {
//	public double caldis(int[] point1, int[] point2){
//		double dis = Math.pow(point1[0]-point2[0], 2) + Math.pow(point1[1]-point2[1], 2);
//		dis = Math.sqrt(dis);
//		return dis;
//		
//	}
//    public int numberOfBoomerangs(int[][] points) {
//        double[][] pos = new double[points.length][points.length];
//        int count = 0;
//        for(int i = 0; i < pos.length; i++){
//        	for(int j = 0; j < pos.length; j++){
//        		pos[i][j] = caldis(points[i],points[j]);
//        	}
//        }
//        for(int i = 0; i < pos.length; i++){
//        	for(int j = 0; j < pos.length; j++){
//        		for(int k = 0; k < pos.length; k++){
//        			if(i != j&&j!=k&&i!=k&&pos[i][j]==pos[j][k])
//        				count++;
//        		}
//        	}
//        }
//        return count;
//        
//    }
	public int caldis(int[] a, int[]b){
		int n = a[0]-b[0];
		int m = a[1]-b[1];
		return n*n+m*m;
	}
	public int numberOfBoomerangs(int[][] points) {
		Map<Integer,Integer> map = new HashMap<>();
		int r = 0;
		for(int i = 0; i < points.length; i++){
			for(int j = 0; j < points.length; j++){
				if(i == j) continue;
				int d = caldis(points[i],points[j]);
				map.put(d, map.getOrDefault(d, 0) + 1);
			}
			for(int val : map.values()){
				r += val * (val - 1);
			}
			map.clear();
		}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberofBoomerangs test = new NumberofBoomerangs();
		int[][] points = {{0,0},{1,0},{2,0},{3,0},{4,0}};
		int r = test.numberOfBoomerangs(points);
		System.out.println(r);
	}

}
