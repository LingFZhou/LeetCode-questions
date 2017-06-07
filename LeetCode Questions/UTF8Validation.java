//2013-3-23
public class UTF8Validation {
    public boolean validUtf8(int[] data) {
    	int check = 0;
    	for(int i = 0; i < data.length; i++){
    		if(check > 0){
    			if((data[i]&0b10000000) == 0b10000000) check--;
    			else return false;
    		}
    		else{
    			if((data[i]&0b11110000)==0b11110000){
    				if((data[i]&0b11111000)==0b11111000) return false;
    				else check = 3;
    			}
    			else if((data[i]&0b11100000)==0b11100000) check = 2;
    			else if((data[i]&0b11000000)==0b11000000) check = 1;
    			else if((data[i]&0b10000000)==0b10000000) return false;
    			else check = 0;
    			
    		}
    	}
    	return check==0;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UTF8Validation test = new UTF8Validation();
		int[] nums = {235, 140, 4};
		boolean res = test.validUtf8(nums);
		System.out.println(res);
	}

}
