//2017-1-26
public class lengthLongestPath {
	public int lengthLongestPath(String input) {
	    String[] path = input.split("\n");
	    int[] stack = new int[path.length+1];
	    int maxlen = 0;
	    for(String s:path){
	    	int level = s.lastIndexOf("\t") +1;
	    	stack[level + 1] = stack[level] + s.length() - level + 1;
	    	int curlen = stack[level + 1];
	    	if(s.contains(".")) maxlen = Math.max(maxlen, curlen - 1);
	    }
	    return maxlen;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "dir\n\tsubdir1\n\t\tfile1.ext"
				+ "\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		
		

		lengthLongestPath test = new lengthLongestPath();
		int i = test.lengthLongestPath(input);
		System.out.println(i);

	}

}
