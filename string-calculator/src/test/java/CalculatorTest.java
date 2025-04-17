import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	@Test
	public void testString() {
	Calculator calculator=new Calculator();
	int result=calculator.add("1,2,3,4");
	assertEquals(10, result);
	}
}
