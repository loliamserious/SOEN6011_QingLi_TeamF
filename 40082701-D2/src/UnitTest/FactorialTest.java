package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

/**
 * Unit Test for factorial function
 * @author Qing Li SID:40082701
 */

public class FactorialTest {
	
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testFactorialFunction1(){
		int n=24;
		assertEquals(6.204484017332394E23,tan.fac(n),1e-6);
	}
	
	@Test
	public void testFactorialFunction2() {
		int n=90;
		assertEquals(1.4857159644817607E138,tan.fac(n),1e-6);
	}
	
	@Test
	public void testFactorialFunction3() {
		int n=6;
		assertEquals(720.0,tan.fac(n),1e-6);
	}
}
