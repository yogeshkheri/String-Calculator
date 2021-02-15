import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void EmptyStringReturnZero() { // This Test Case For Return Zero, If String Is Empty
		assertEquals(0, StringCalculator.add(""));
	}

}
