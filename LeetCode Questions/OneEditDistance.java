//2017-4-20
public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        if(lens==lent){
        	if(lens==0) return false;
        	int count = 0;
        	for(int i = 0; i < lens; i++){
        		if(s.charAt(i)!=t.charAt(i)) count++;
        	}
        	if(count!=1) return false;
        }
        else if(Math.abs(lens-lent)>1) return false;
        else if(lens-lent==1){
        	for(int i = 0; i < lent; i++){
        		if(s.charAt(i)!=t.charAt(i))
        			return s.substring(i+1).equals(t.substring(i));
        	}
        }
        else if(lent-lens==1){
        	for(int i = 0; i < lens; i++){
        		if(s.charAt(i)!=t.charAt(i))
        			return t.substring(i+1).equals(s.substring(i));
        		
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneEditDistance test = new OneEditDistance();
		String s = "teacher";
		String t = "teachy";
		boolean res = test.isOneEditDistance(s, t);
		System.out.println(res);
	}

}
