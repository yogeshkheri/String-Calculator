import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringCalculator {

	public static int add(String val) {
		
		if(val.isEmpty())
		{
		return 0; // Return Value If String Is Empty
		}
		else if (val.startsWith("//")) {
			Matcher mat= Pattern.compile("//(.)\n(.*)").matcher(val);
			mat.matches();
			String custDelimiter = mat.group(1);
			String number= mat.group(2);
			Stream<String> tokenStream = Stream.of(number.split(custDelimiter)); 
			int[] tokenIntVale = tokenStream.mapToInt(Integer::parseInt).toArray();
			return Arrays.stream(tokenIntVale).sum();		
		}
		else if (val.contains(",")) { // Return Sum of Multiple Values Only If they Contains comma and Return Sum of Values 
			Stream<String> tokenStream = Stream.of(val.split(",|\n")); 
			int[] tokenIntVale = tokenStream.mapToInt(Integer::parseInt).toArray();
			return Arrays.stream(tokenIntVale).sum();
		}
		else {
			return Integer.parseInt(val); // Return Value If String have only Single Value
		}
	
	}
		
}
