import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	//under test
	Calculator calc = new Calculator();
	@Test
	public void checkAdd(){
		assertEquals(5.0, calc.add(2.0, 3.0), 0);
		assertEquals(10, calc.add(5, 5), 0);
		assertEquals(-1, calc.add(2, -3), 0);
		System.out.println("Add " + calc);
	}
	
	@Test
	public void checkSub(){
		assertEquals(5, calc.sub(8, 3), 0);
		assertEquals(-80, calc.sub(20, 100), 0);
		assertEquals(12, calc.sub(12, 0), 0);
		System.out.println("Sub " + calc);
	}
	
	@Test
	public void checkMulti(){
		assertEquals(12, calc.multi(3, 4), 0);
		assertEquals(-12, calc.multi(-3, 4), 0);
		assertEquals(-12, calc.multi(3, -4), 0);
		assertEquals(12, calc.multi(-3, -4), 0);
		System.out.println("Multi " + calc);
	}
	
	@Test
	public void checkDiv(){
		assertEquals(5, calc.div(25, 5), 1);
		assertEquals(1, calc.div(2, 2), 1);
		assertEquals(3, calc.div(12, 4), 1);
		assertEquals(8.3, calc.div(25, 3), 1);
		assertEquals(16.6, calc.div(100, 6), 1);
		System.out.println("Div " + calc);
	}
	
	@Test
	public void checkGreater(){
		assertTrue(calc.greater(5.0, 4.0));
		assertFalse(calc.greater(5.0, 6.0));
		System.out.println("Greater " + calc);
	}
		
}
