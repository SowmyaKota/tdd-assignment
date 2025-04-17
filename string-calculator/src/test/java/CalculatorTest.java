import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	private final Calculator calculator= new Calculator();
	
	@Test
	public void testStringreturnZero() {
	assertEquals(0, calculator.add(""));
	}
	
	@Test
	public void testSingleNumber() {
	assertEquals(1, calculator.add("1"));
	}
	
	@Test
	public void testTwoNumbers() {
	assertEquals(6, calculator.add("1,5"));
	}
	
	@Test
	public void testMultipleNumbers() {
	assertEquals(10, calculator.add("1,2,3,4"));
	}
	
	@Test
	public void testNewLineBetweenNumbers() {
	assertEquals(6, calculator.add("1\n2,3"));
	}
	
	@Test
	public void testNewLineAndCommaBetweenNumbers() {
	assertEquals(10, calculator.add("1\n2,3\n4"));
	}
	
	@Test
	public void testDelimiter() {
	assertEquals(3, calculator.add("//;\n1;2"));
	}
	
	@Test
	public void testMultipleDelimiter() {
	assertEquals(10, calculator.add("//#\n1#2#3#4"));
	}
	
}
