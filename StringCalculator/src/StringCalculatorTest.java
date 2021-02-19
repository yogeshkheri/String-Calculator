import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void EmptyStringReturnZero() { // This Test Case For Return Zero, If String Is Empty
		assertEquals(0, StringCalculator.add(""));
	}
	@Test
	public void StringWithOneReturnValue() { // This Test Case For Sending 1 as String and Return Value is 1
		assertEquals(1,StringCalculator.add("1"));
	}
	@Test
	public void StringWithOneAndTwoReturnSumValue() { // This test Case For Sending 1,2 as String and Return Value is 3
		assertEquals(3, StringCalculator.add("1,2")); 
	}
	@Test
	public void StringWithMultipleNumberReturnValue() { // This test Case For Sending multiple Number with comma separated and Return Sum of Values 
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
	@Test
	public void StringWithMultipleReturnSumValue() { // This test case for Sending multiple with comma and new lines and Return Sum of Values
		assertEquals(6,StringCalculator.add("1\n2,3"));
	}

	
	  @Test public void StringWithDelimiterReturnSumValue() { // This test case for Sending delimiter and Return sum of Values assertEquals(6,
	  StringCalculator.add("//;\n1;2;3");
	  }
	 
	@Test
	public void RaiseExceptionStringContainNegitive() {  // This Test Case For Sending Exception If Negative Number is found in string
		try {
			StringCalculator.add("1,-2,3");
			
		} catch (Exception e) {
			int[] x = new int[1];
			x[0]=-2;
			assertEquals("Negative Not Allowed"+x[0], e.getMessage());
		}
	}

	
	  @Test public void StringWithMultipleDelimiterReturnSumValue() { // This test case for Sending delimiter and Return sum of Values assertEquals(6,
	  StringCalculator.add("//[;;;]\n1;;;2;;;3"); 
	  }
	 
	@Test
	public void StringWithGreaterValeReturnSumValue() { // This test case for Sending multiple with comma and new lines with value greater then 1000 and Return Sum of Values
		assertEquals(6,StringCalculator.add("1\n2,3,1001"));
	}
	@Test
	public void StringWithDiffernetDelimiterReturnSumValue() { // This test case for Sending delimiter and Return sum of Values
		assertEquals(6, StringCalculator.add("//[;][*]\n1;2*3"));
	}
	@Test
	public void StringWithDiffernetDelimiterWithMultipleReturnSumValue() { // This test case for Sending delimiter with Multiple Delimiter and Return sum of Values
		assertEquals(6, StringCalculator.add("//[;;][**]\n1;;2**3"));
	}
}
