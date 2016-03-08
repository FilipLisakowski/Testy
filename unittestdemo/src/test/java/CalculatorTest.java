import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	//under test
	Calculator calc = new Calculator();
	@Test
	public void checkAdd(){
		assertEquals(5, calc.add(2, 3));
		assertEquals(10, calc.add(5, 5));
		assertEquals(-1, calc.add(2, -3));
		System.out.println("Add " + calc);
	}
	
	@Test
	public void checkSub(){
		assertEquals(5, calc.sub(8, 3));
		assertEquals(-80, calc.sub(20, 100));
		assertEquals(12, calc.sub(12, 0));
		System.out.println("Sub " + calc);
	}
	
	@Test
	public void checkMulti(){
		assertEquals(12, calc.multi(3, 4));
		assertEquals(-12, calc.multi(-3, 4));
		assertEquals(-12, calc.multi(3, -4));
		assertEquals(12, calc.multi(-3, -4));
		System.out.println("Multi " + calc);
	}
	
	@Test
	public void checkDiv(){
		assertEquals(5, calc.div(25, 5));
		assertEquals(1, calc.div(2, 2));
		assertEquals(3, calc.div(12, 4));
		System.out.println("Div " + calc);
	}
	
	@Test
	public void checkGreater(){
		assertTrue(calc.greater(5, 4));
		assertFalse(calc.greater(5, 6));
		System.out.println("Greater " + calc);
	}
	
	@Test (expected = ArithmeticException.class)
    public void checkDivException()
    {
     calc.div(10, 0);
    }
	
}
