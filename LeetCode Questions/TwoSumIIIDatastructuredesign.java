import java.util.*;
//2017-3-1
public class TwoSumIIIDatastructuredesign {
	HashMap<Integer,Integer> table = new HashMap();
	
	public TwoSumIIIDatastructuredesign() {
        
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        table.put(number,table.getOrDefault(number,0)+1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
    	Set<Integer> ks = table.keySet();
        for(Integer i : ks){
        	if(value - i != i)
        	{
        		if(ks.contains(value-i)) return true;
        	}
        	else if(value-i==i){
        		if(table.get(i)>=2) return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumIIIDatastructuredesign test = new TwoSumIIIDatastructuredesign();
		test.add(0);
		test.add(0);
		
		System.out.println(test.find(0));
		
	}

}
