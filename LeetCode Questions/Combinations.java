import java.util.*;
//2017-4-9
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> list = new ArrayList<>();
    	List<Integer> lis = new ArrayList<>();
    	helper(list,lis,1,n,k);
    	System.out.println(list);
    	return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> lis, 
    		int index,int n,int k){
    	if(lis.size()==k) {list.add(lis); return;}
    	for(int i = index; i <= n; i++){
    		lis.add(i);
    		helper(list,new ArrayList<>(lis),i+1,n,k);
    		lis.remove(lis.size()-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations test = new Combinations();
		test.combine(4, 4);
	}

}
