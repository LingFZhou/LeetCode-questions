import java.util.*;
//2017-1-31
public class BinaryWatch {
	public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        for(int i = 0; i < 12; i++){
        	for(int j = 0; j < 60; j++){
        		if(Integer.bitCount(i)+Integer.bitCount(j) == num)
        			result.add(String.format("%d:%02d", i,j));
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryWatch test = new BinaryWatch();
		int num = 2;
		List<String> r = new ArrayList<String>();
		r = test.readBinaryWatch(num);
		for(String s : r)
			System.out.println(s);
	}

}
