//2017-4-23
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] dif = new int[gas.length*2];
        for(int i = 0; i<gas.length; i++){
        	dif[i] = gas[i]-cost[i];
        	dif[i+gas.length] = gas[i]-cost[i];
        }
        int index = Integer.MAX_VALUE;
        int sum = 0;
        int j = gas.length;
        for(int i = 0; i < j; i++){
        	sum+=dif[i];
        	if(sum<0) {
        		sum=0;
        		index = Integer.MAX_VALUE;
        		j=i+gas.length+1;
        		if(j>=dif.length) return -1;
        		continue;
        	}
        	else {
        		index = Math.min(index, i);
        	}
        }
        if(index!=Integer.MAX_VALUE) return index;
        else return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GasStation test = new GasStation();
		int[] gas = {1,2,3,3};
		int[] cost = {2,1,5,1};
		int res = test.canCompleteCircuit(gas, cost);
		System.out.println(res);
	}

}
