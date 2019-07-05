package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

	@Parameters
	public static Iterable<Object[]> getData(){
//		List<Object[]> obj = new ArrayList<>();
//		obj.add(new Object[] {3,1,4});
//		obj.add(new Object[] {2,1,3});
//		obj.add(new Object[] {3,4,7});
//		obj.add(new Object[] {9,1,10});
//		return obj
		return Arrays.asList(new Object[][] {
			{3,1,4},
			{2,1,3},
			{3,4,7},
			{9,1,10}
		});

	}
	
	private int a, b, exp;
	public CalculadoraParametroTest(int a, int b, int exp){
		this.a= a;
		this.b = b;
		this.exp = exp;
	}
	@Test
	public void testAdd() {
		Calculadora cal = new Calculadora();
		int result = cal.add(a,b);
		assertEquals(exp, result);

	}

}
