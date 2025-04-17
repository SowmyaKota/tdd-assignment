import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	@Test
	public void testString() {
	Calculator calculator=new Calculator();
	int result=calculator.add("");
	assertEquals(0, result);
	}
}
