import java.util.*;
//2017-3-28
public class InsertDeleteGetRandomO1 {
	Set<Integer> set = new HashSet<>();
    /** Initialize your data structure here. */
    public InsertDeleteGetRandomO1() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        else{
            set.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)){
        	set.remove(val);
        	return true;
        }
        else return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int size = set.size();
        if(size==0) return -1;
        int m = (int)(Math.random()*size);
        List<Integer> lis = new ArrayList<>(set);
        return lis.get(m);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
