import java.util.*;
//2017-4-10
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size()-2;i>=0;i--){
        	for(int j = 0;j<=i;j++){
        		triangle.get(i).set(j, triangle.get(i).get(j)
        				+Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
        	}
        }
        return triangle.get(0).get(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
