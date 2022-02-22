package Com.accenture.tetcase;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	private double firstNumber;
	private double secondNumber;
	private double result;

	@Before
	public void initTest() {
		calculator = new Calculator();
		firstNumber = 10;
		secondNumber = 0;
	}
	
	@After
	public void afterTest() {
		 calculator = null;
	}

	@Test
	public void testAddition() {
		result = calculator.addition(firstNumber, secondNumber);
		assertEquals(new Double(firstNumber), new Double(result));
	}

	@Test
	public void testSubtraction() {
		result = calculator.subtraction(firstNumber, secondNumber);
		assertEquals(new Double(firstNumber), new Double(result));
	}

	@Test
	public void testMultiplication() {
		result = calculator.multiplication(firstNumber, secondNumber);
		assertEquals(new Double(secondNumber), new Double(result));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivition() {
		calculator.divition(8, 0);
	}

}
