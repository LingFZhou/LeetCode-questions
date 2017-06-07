import java.util.*;
//2017-3-27
public class FindPermutation {
    public int[] findPermutation(String s) {
        int len = s.length();
        int countd = 0;
        int[] res = new int[len+1];
        List<Integer> list = new ArrayList<>();
        List<Integer> lis = new ArrayList<>();
        for(int i = 0; i < len+1; i++) list.add(i+1);
        for(int i = 0; i < len; i++){
        	if(s.charAt(i)=='I'){
        		if(countd==0)	{
        			lis.add(list.get(0));
        			list.remove(0);
        		}
        		else{
        			while(countd>0){
        				lis.add(list.get(countd));
        				list.remove(countd);
        				countd--;
        			}
        			lis.add(list.get(0));
        			list.remove(0);
        		}
        	}
        	else countd++;
        }
        if(countd>0){
        	while(countd>0){
				lis.add(list.get(countd));
				list.remove(countd);
				countd--;
			}
        }
        lis.addAll(list);
        System.out.println(lis);
        for(int i = 0; i < res.length; i++) res[i] = lis.get(i);
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPermutation test = new FindPermutation();
		String s = "";
		int[] res = test.findPermutation(s);
		
	}

}
