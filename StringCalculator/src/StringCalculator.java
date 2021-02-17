import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;


public class StringCalculator {

	public static int add(String val) {
		
		if(val.isEmpty())
		{
		return 0; // Return Value If String Is Empty
		}
		else if (val.startsWith("//")) {
			Matcher mat= Pattern.compile("//(.*)\n(.*)").matcher(val);
			mat.matches();
			String custDelimiter = mat.group(1);
			String number= mat.group(2);
			Stream<String> tokenStream = Stream.of(number.split(custDelimiter)); 
			return getSumValue(tokenStream);
		}
		else if (val.contains(",")) { // Return Sum of Multiple Values Only If they Contains comma and Return Sum of Values 
			Stream<String> tokenStream = Stream.of(val.split(",|\n")); 
			return getSumValue(tokenStream);
		}
		else {
			return Integer.parseInt(val); // Return Value If String have only Single Value
		}
	
	}
	private static int getSumValue(Stream<String> StringValue)
	{
		int[] tokenIntVale = StringValue.mapToInt(Integer::parseInt).toArray();
		int[] negitiveNumber= Arrays.stream(tokenIntVale).filter(i -> i < 0).toArray();
		if(negitiveNumber.length > 0)
		{
			throw new RuntimeErrorException(null,"Negative Not Allowed");
		} 
		return Arrays.stream(tokenIntVale).filter(n -> n<1000).sum();	
	}
		
}
