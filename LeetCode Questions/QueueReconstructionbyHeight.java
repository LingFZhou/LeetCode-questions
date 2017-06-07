import java.util.Arrays;
import java.util.*;
//2017-3-2
public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
    	List<List<Integer>> list = new ArrayList();
		for(int i = people.length-1; i > 0; i--){
        	for(int j = 0; j < i; j++){
        		if(people[j][0]<people[j+1][0]){
        			int temp1 = people[j][0];
        			int temp2 = people[j][1];
        			people[j][0] = people[j+1][0];
        			people[j][1] = people[j+1][1];
        			people[j+1][0] = temp1;
        			people[j+1][1] = temp2;
        		}
        		else if(people[j][0]==people[j+1][0]){
        			if(people[j][1]>people[j+1][1]){
        				int temp1 = people[j][0];
            			int temp2 = people[j][1];
            			people[j][0] = people[j+1][0];
            			people[j][1] = people[j+1][1];
            			people[j+1][0] = temp1;
            			people[j+1][1] = temp2;
        			}
        		}
        	}
        }
		
		for(int i = 0; i < people.length;i++){
			List<Integer> lis = new ArrayList();
			lis.add(people[i][0]);
			lis.add(people[i][1]);
			list.add(people[i][1], lis);
		}
		
        
        int[][] res = new int[people.length][2];
        for(int i = 0; i < list.size(); i++){
        	res[i][0] = list.get(i).get(0);
        	res[i][1] = list.get(i).get(1);
        }
        
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		QueueReconstructionbyHeight test = new QueueReconstructionbyHeight();
		int[][] res = test.reconstructQueue(people);
	
	}

}
