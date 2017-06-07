import java.util.*;
//2017-2-4
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> result = new ArrayList();
        if(numRows == 0) return result;
        List<Integer> list1 = new ArrayList();
    	list1.add(1);
    	list1.add(1);
        for(int i = 0; i < numRows; i++){
        	List<Integer> list2 = new ArrayList();
        	
        	list2.add(1);
        	for(int j = 0; j <= i - 2; j++){
        		list2.add(list1.get(j) + list1.get(j+1));
        	}
        	list2.add(1);
        	result.add(list2);
        	list1 = result.get(i);
        }
        List<Integer> list3 = new ArrayList();
        list3.add(1);
        result.remove(0);
        result.add(0,list3 );
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle test = new PascalTriangle();
		List <List<Integer>> result = test.generate(4);
		System.out.println(result.get(3));
	}

}
