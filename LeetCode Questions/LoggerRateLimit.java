//2017-1-26
import java.util.*;

public class LoggerRateLimit {
	private Map<String, Integer> logger = new HashMap<>();

    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (timestamp < logger.getOrDefault(message, 0))
            return false;
        logger.put(message, timestamp + 10);
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerRateLimit test = new LoggerRateLimit();
		System.out.println(test.shouldPrintMessage(1, "foo"));
		System.out.println(test.shouldPrintMessage(11, "foo"));
	}

}
