import java.util.Arrays;
//2017-1-31
public class FindContentChildren {
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0, count = 0;
        for(int i = 0; i < s.length; i++){
        	if(j<g.length){
        		if(s[i]>=g[j]){
        			count++;
        			j++;
        		}
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindContentChildren test = new FindContentChildren();
		int[] g = {1,2};
		int[] s = {1,2,3};
		int r = test.findContentChildren(g, s);
		System.out.println(r);
	}

}
