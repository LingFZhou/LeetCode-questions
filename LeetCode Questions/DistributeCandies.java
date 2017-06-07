import java.util.*;
//2017-5-6
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < candies.length; i++){
        	map.put(candies[i], map.getOrDefault(candies[i], 0)+1);
        }
        if(map.size()<=candies.length/2) return map.size();
        else return candies.length/2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistributeCandies test = new DistributeCandies();
		int[] candies = {1,1,2,2,3,3};
		System.out.println(test.distributeCandies(candies));
	}

}
