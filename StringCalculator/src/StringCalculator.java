
public class StringCalculator {

	public static int add(String val) {
		
		if(val.isEmpty())
		{
		return 0; // Return Value If String Is Empty
		}
		else if (val.contains(",")) { // Return Sum of Two Values Only If they Contains comma and Return Sum of Values 
			String[] tokenArray = val.split(",");
			return Integer.parseInt(tokenArray[0])+ Integer.parseInt(tokenArray[1]);
		}
		else {
			return Integer.parseInt(val); // Return Value If String have only Single Value
		}
	}
}
