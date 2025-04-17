import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	@Test
	public void testString() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1");
	assertEquals(1, result);
	}
}
