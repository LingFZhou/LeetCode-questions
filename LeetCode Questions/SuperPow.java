import java.util.*;
//2017-3-22
public class SuperPow {
    public int superPow(int a, int[] b) {
        if(a == 0||a==1337||b.length==0) return 0;
        if(a == 1) return 1;
        if(a > 1337) return superPow(a%1337,b);
        else{
        	List<Integer> lis = new ArrayList<>();
        	boolean[] flag = new boolean[1337];
        	int temp = a%1337;
        	while(!flag[temp]){
        		flag[temp] = true;
        		lis.add(temp);
        		temp = (temp*a)%1337;
        	}
        	int si = lis.size();
        	int m = 0;
        	for(int i = 0; i < b.length; i++){
        		m = (m*10+b[i])%si;
        	}
        	int index = m==0?si:m;
        	return lis.get(index-1);	
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
