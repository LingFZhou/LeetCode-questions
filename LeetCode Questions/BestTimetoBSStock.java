import java.util.ArrayList;
import java.util.Arrays;
//2017-2-2
public class BestTimetoBSStock {
    public int maxProfit(int[] prices) {
    	if(prices.length == 0) return 0;
        int profit = 0;
        int curmin = prices[0];
        for(int i = 0; i < prices.length; i++){
        	if(prices[i] > curmin){
        		profit = Math.max(prices[i] - curmin, profit);
        	}
        	else curmin = prices[i];
        }
        return profit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		BestTimetoBSStock test = new BestTimetoBSStock();
		int pro = test.maxProfit(prices);
		System.out.println(pro);
	}

}
