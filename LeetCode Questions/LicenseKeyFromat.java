//2017-1-26
public class LicenseKeyFromat {
	public String licenseKeyFormatting(String S, int K) {
//		StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--)
//            if (s.charAt(i) != '-')
//                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
//        return sb.reverse().toString().toUpperCase();
		String[] lic = S.split("-");
		StringBuffer license = new StringBuffer();
		for(int i = 0; i < lic.length; i++){
			license.append(lic[i]);
		}
		license.reverse();
		int len;
		if(license.length() % K == 0){
			len = license.length() / K;
		}
		else {
			len = license.length() / K + 1;
		}
		int j = 0, k = 0;
		while(j<(len-1)*K){
			j=j+K;
			license.insert(j+k, "-");
			k++;
		}
		
		license.reverse();
		license.toString();
		String str = license.toString();
		str = str.toUpperCase();
		return str;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicenseKeyFromat test = new LicenseKeyFromat();
		
		
		System.out.println(test.licenseKeyFormatting("2-4A0r7-4k", 3));
		
		
		

		
		
	}

}
