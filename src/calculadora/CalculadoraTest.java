package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	
	Calculadora cal;
	
	@Before
	public void before() {
		System.out.println("before");
		cal = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("After");
		cal.clear();
	}
	@Test
	public void TestSum() {
		int result = cal.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}
	
	@Test
	public void TestAnsSum() {
		cal.add(3, 2);
		int resul = cal.ans();
		int esper = 5;
		assertEquals(esper, resul);
	}
	
	@Test
	public void TestDiv() {
		cal.div(5,2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void TestDivByCero() {
		cal.div(5, 0);
	}
	
	@Test(timeout = 1000)
	public void testOperationOptima() {
		cal.operationOptima();
	}
}
