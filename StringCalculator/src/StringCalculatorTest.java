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
	public void StringWithOneAndTwoReturnSumValue() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
}
