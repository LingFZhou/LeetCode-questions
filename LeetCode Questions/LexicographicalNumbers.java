import java.util.*;
//2017-3-17
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        int cur = 1;
        for(int i = 0; i < n; i++){
        	list.add(cur);
        	if(cur*10<=n) cur *= 10;
        	else if(cur%10!=9&&cur+1<=n) cur++;
        	else{
        		cur/=10;
        		while(cur%10==9) cur /= 10;
        		cur++;
        	}
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LexicographicalNumbers test = new LexicographicalNumbers();
		List<Integer> list = test.lexicalOrder(13);
		System.out.println(list);
	}

}
