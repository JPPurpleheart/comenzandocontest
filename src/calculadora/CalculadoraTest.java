package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(2, 3);
		int esper = 5; // 2 + 3 = 5
		assertEquals(esper, resul);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		int resul = calc.ans();
		int esper = 5; // 2 + 3 = 5
		assertEquals(esper, resul);
	}

}
