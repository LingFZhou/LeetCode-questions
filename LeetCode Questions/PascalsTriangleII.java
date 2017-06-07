import java.util.*;
//2017-2-7
public class PascalsTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for(int i = 1; i <= rowIndex; i++){
			for(int j = i - 1; j >= 1; j--){
				int t = list.get(j-1) + list.get(j);
				list.set(j, t);
			}
			list.add(1);
		}
		return list;
//        List <List<Integer>> result = new ArrayList();
//        List<Integer> list1 = new ArrayList();
//    	list1.add(1);
//    	list1.add(1);
//        for(int i = 0; i < rowIndex+1; i++){
//        	List<Integer> list2 = new ArrayList();
//        	list2.add(1);
//        	for(int j = 0; j <= i - 2; j++){
//        		list2.add(list1.get(j) + list1.get(j+1));
//        	}
//        	list2.add(1);
//        	result.add(list2);
//        	list1 = result.get(i);
//        }
//        List<Integer> list3 = new ArrayList();
//        list3.add(1);
//        result.remove(0);
//        result.add(0,list3 );
//        return result.get(rowIndex);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangleII test = new PascalsTriangleII();
		List<Integer> result = test.getRow(1);
		System.out.println(result);
	}

}
