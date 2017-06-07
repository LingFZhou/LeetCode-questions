import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
        	if(i % 3 == 0 && i % 5 != 0){
        		s.add("Fizz");
        	}
        	if(i % 3 != 0 && i % 5 == 0){
        		s.add("Buzz");
        	}
        	if(i % 3 == 0 && i % 5 == 0){
        		s.add("FizzBuzz");
        	}
        	if(i % 3 != 0 && i % 5 != 0){
        		s.add(Integer.toString(i));
        	}    		
        }
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz test = new FizzBuzz();
		System.out.println(test.fizzBuzz(15));
	}

}
