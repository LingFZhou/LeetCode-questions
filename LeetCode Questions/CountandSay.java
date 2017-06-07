import java.util.ArrayList;
//2017-2-14
public class CountandSay {
    public String countAndSay(int n) {
    	ArrayList<String> list = new ArrayList<>();
    	int j = n;
    	list.add("1");
    	int i = 0;
        while(n>0){
        	list.add(help(list.get(i)));
        	n--;
        	i++;
        }
        return String.valueOf(list.get(j-1));
    }
    public String help(String n){
    	String str = n;
        String res = "";
        int count = 1;
        for(int i = 0; i < str.length()-1; i++){
        	if(str.charAt(i)==str.charAt(i+1)) count++;
        	else{
        		res += String.valueOf(count) + str.charAt(i);
        		count = 1;
        	}
        }
        if(count == 1) res += "1" + str.charAt(str.length()-1);
        else res += String.valueOf(count) + str.charAt(str.length()-1);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountandSay test = new CountandSay();
		String re = test.countAndSay(1);
		System.out.println(re);
	}

}
