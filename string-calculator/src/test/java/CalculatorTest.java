import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	
	@Test
	public void testStringreturnZero() {
	Calculator calculator=new Calculator();
	int result=calculator.add("");
	assertEquals(0, result);
	}
	
	@Test
	public void testSingleNumber() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1");
	assertEquals(1, result);
	}
	
	@Test
	public void testTwoNumbers() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1,5");
	assertEquals(6, result);
	}
	
	@Test
	public void testMultipleNumbers() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1,2,3,4");
	assertEquals(10, result);
	}
	
	@Test
	public void testNewLineBetweenNumbers() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1\n2,3");
	assertEquals(6, result);
	}
	
	@Test
	public void testNewLineAndCommaBetweenNumbers() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1\n2,3\n4");
	assertEquals(10, result);
	}
}
