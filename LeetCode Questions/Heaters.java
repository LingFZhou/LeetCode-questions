import java.util.Arrays;
//2017-2-26
public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = Integer.MIN_VALUE;
        for(int house : houses){ 	
        	int index = Arrays.binarySearch(heaters, house);
        	if(index<0) index = -(index+1);
        	int dis1 = index>=1?house-heaters[index-1]:Integer.MAX_VALUE;
        	int dis2 = index<heaters.length?heaters[index]-house:Integer.MAX_VALUE;	
        	int dis = Math.min(dis1, dis2);
        	res = Math.max(res, dis);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
