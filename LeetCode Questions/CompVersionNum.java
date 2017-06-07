
public class CompVersionNum {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        String m = "";
        String n = "";
        for(int i = 0; i < v1.length; i++){
        	m += v1[i];
        }
        for(int i = 0; i < v2.length; i++){
        	n += v2[i];
        }
        int a = Integer.parseInt(m);
        a = a + 0;
        m = String.valueOf(a);
        System.out.println(m);
        if(m.compareTo(n)<0) return -1;
        if(m.compareTo(n)>0) return 1;
        if(m.compareTo(n)==0) return 0;

        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompVersionNum test = new CompVersionNum();
		System.out.println(test.compareVersion("0.0.1.1.1.1","01111"));
	}

}
