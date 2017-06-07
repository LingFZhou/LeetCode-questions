//2017-2-15
public class CountPrimes {
    public int countPrimes(int n) {
    	int count = 0;
        boolean[] pri = new boolean[n];
        for(int i = 2; i < n; i++) pri[i] = true;
        for(int i = 2; i * i < n;i++){
        	if(!pri[i]) continue;
        	for(int j = i*i; j < n; j+=i){
        		pri[j] = false;
        	}
        }
        for(boolean f : pri) if(f) count++;
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes test = new CountPrimes();
		int res = test.countPrimes(20);
		System.out.println(res);
	}

}
