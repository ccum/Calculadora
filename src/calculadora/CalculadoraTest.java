package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	
	static Calculadora cal;
	
	@BeforeClass
	public static void befoeClass() {
		System.out.println("metodo  before class");
		cal = new Calculadora();
	}
	
	@Before
	public void before() {
		System.out.println("before");
		cal.clear();
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
	
	@AfterClass
	public static void affterClass() {
		System.out.println("affterClass");
	}
}
