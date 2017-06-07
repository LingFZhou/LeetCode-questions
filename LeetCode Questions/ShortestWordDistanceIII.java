//2017-2-6
public class ShortestWordDistanceIII {
	public int shortestWordDistance(String[] words, String word1, String word2) {
		int p1 = -1;
		int p2 = -1;
		int p3 = -1;
		int min = Integer.MAX_VALUE;
		if(!word1.equals(word2)){
			for(int i = 0; i < words.length; i++){
				if(words[i].equals(word1)) p1 = i;
				if(words[i].equals(word2)) p2 = i;
				if(p1!=-1&&p2!=-1) min = Math.min(min, Math.abs(p1-p2));
			}
		}
		if(word1.equals(word2)){
			for(int i = 0; i < words.length; i++){
				if(words[i].equals(word1)){
					if(p3!=-1) min = Math.min(min, Math.abs(i-p3));
					p3 = i;
				}
			}
		}
		return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[]{"a", "b","a"};
		String word1 = "a";
		String word2 = "a";
		ShortestWordDistanceIII test = new ShortestWordDistanceIII();
		System.out.println(test.shortestWordDistance(words, word1, word2));
	}

}
