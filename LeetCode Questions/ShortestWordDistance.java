import java.util.ArrayList;
import java.util.Arrays;
//2017-1-30
public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
//		int p1 = -1;
//		int p2 = -1;
//		int min = Integer.MAX_VALUE;
//		for(int i = 0; i < words.length; i++){
//			if(words[i].equals(word1)) p1 = i;
//			if(words[i].equals(word2)) p2 = i;
//			if(p1!=-1&&p2!=-1) min = Math.min(min, Math.abs(p1-p2));
//			
//		}
//		return min;
		ArrayList<Integer> lis = new ArrayList();
		ArrayList<Integer> lis2 = new ArrayList();
		for(int i = 0; i < words.length; i++){
			if(words[i].equals(word1)) lis.add(i);
			if(words[i].equals(word2)) lis2.add(i);
		}
		int dis = Math.abs(lis.get(0)-lis2.get(0));
		for(Integer in1 : lis){
			for(Integer in2 : lis2){
				dis = Math.min(dis, Math.abs(in1-in2));
			}
		}
		return dis;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[]{"a", "b"};
		String word1 = "a";
		String word2 = "b";
		ShortestWordDistance test = new ShortestWordDistance();
		System.out.println(test.shortestDistance(words, word1, word2));

	}

}
