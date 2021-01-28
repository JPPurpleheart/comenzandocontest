package calculadora;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParametro {

	@Parameters
	public static Iterable<Object[]> getDatos(){
		/*Método en varias líneas:
		 * 
		 * List<Object[]> parametrosResta = new ArrayList<>();
		 * parametrosResta.add(new Object[] {30, 29, 1});
		 * parametrosResta.add(new Object[] {40, 28, 12});
		 * parametrosResta.add(new Object[] {605, 61, 59});
		 * return parametrosResta;*/
		
		return Arrays.asList(new Object[][] {
			{30, 29, 1}, {40, 28, 12}, {605, 61, 544}
		});
	}
	
	private int a, b, expected;
	
	public CalculadoraParametro(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	@Test
	public void testSub() {
		Calculadora calc = new Calculadora();
		int result = calc.sub(a, b);
		assertEquals(expected, result);
	}

}
