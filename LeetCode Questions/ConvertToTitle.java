
public class ConvertToTitle {
	    public String convertToTitle(int n) {
	        StringBuffer result = new StringBuffer();
	        int m;
	        while(n>0){
	        	m = n%26;
	        	switch(m){
	        	case 0: result.insert(0, 'Z'); break;
	        	case 1: result.insert(0, 'A');break;
	        	case 2: result.insert(0, 'B');break;
	        	case 3: result.insert(0, 'C');break;
	        	case 4: result.insert(0, 'D');break;
	        	case 5: result.insert(0, 'E');break;
	        	case 6: result.insert(0, 'F');break;
	        	case 7: result.insert(0, 'G');break;
	        	case 8: result.insert(0, 'H');break;
	        	case 9: result.insert(0, 'I');break;
	        	case 10: result.insert(0, 'J');break;
	        	case 11: result.insert(0, 'K');break;
	        	case 12: result.insert(0, 'L');break;
	        	case 13: result.insert(0, 'M');break;
	        	case 14: result.insert(0, 'N');break;
	        	case 15: result.insert(0, 'O');break;
	        	case 16: result.insert(0, 'P');break;
	        	case 17: result.insert(0, 'Q');break;
	        	case 18: result.insert(0, 'R');break;
	        	case 19: result.insert(0, 'S');break;
	        	case 20: result.insert(0, 'T');break;
	        	case 21: result.insert(0, 'U');break;
	        	case 22: result.insert(0, 'V');break;
	        	case 23: result.insert(0, 'W');break;
	        	case 24: result.insert(0, 'X');break;
	        	case 25: result.insert(0, 'Y');break;
	        	}
	        	n = (n-1) / 26 ;
	        	
	        }
	        
	        String r = result.toString();
	
	        return r;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertToTitle test = new ConvertToTitle();
		System.out.println(test.convertToTitle(52));
	}

}
