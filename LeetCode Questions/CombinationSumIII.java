import java.util.*;
//2017-2-15
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> lis = new ArrayList();
        help(k,n,list,lis,1);
        return list;  
    }
    public void help(int k, int n,List<List<Integer>> list, List<Integer> lis,int dif){
    	if(k == 0){
    		if(n==0){
    			list.add(new ArrayList<Integer>(lis));
    			return;
    		}
    	}
    	for(int i = dif; i <= 9;i++){
    		lis.add(i);
    		help(k-1,n-i,list,lis,i+1);
    		lis.remove(lis.size()-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSumIII test = new CombinationSumIII();
		List<List<Integer>> list = test.combinationSum3(2, 7);
		System.out.println(list);
	}

}
