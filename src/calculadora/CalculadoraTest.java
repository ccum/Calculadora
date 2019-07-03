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

}
