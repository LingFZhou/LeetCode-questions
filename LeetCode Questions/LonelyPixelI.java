import java.util.*;
//2017-3-4
public class LonelyPixelI {
    public int findLonelyPixel(char[][] picture) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < picture.length; i++){
        	for(int j = 0; j < picture[0].length; j++){
        		if(picture[i][j] == 'B'){
        			s1.add(i);
        			s2.add(j);
        		}
        	}
        }
        int res = 0;
        for(int i = 0; i < s1.size();i++){
        	map1.put(s1.get(i), map1.getOrDefault(s1.get(i), 0)+1);
        	map2.put(s2.get(i), map2.getOrDefault(s2.get(i), 0)+1);   	
        }
        for(int i = 0; i < s1.size();i++){
        	if(map1.get(s1.get(i))==1&&map2.get(s2.get(i))==1) res++;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LonelyPixelI test = new LonelyPixelI();
		char[][] picture = {{'W','W','B'},{'W','B','W'},{'B','W','W'}};
		int res = test.findLonelyPixel(picture);
		System.out.println(res);
	}

}
