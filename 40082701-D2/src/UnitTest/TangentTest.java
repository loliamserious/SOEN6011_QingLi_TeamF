package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

/**
 * Unit Test for tangent function
 * @author Qing Li SID:40082701
 */

public class TangentTest {

	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testTangentFunction1(){
		String msg="45";
		assertEquals("tan(45.0)= 1.000000",tan.tangent(msg));
	}
	
	@Test
	public void testTangentFunction2() {
		String msg="120";
		assertEquals("tan(120.0)= -1.732051",tan.tangent(msg));
	}
	
	@Test
	public void testTangentFunction3() {
		String msg="-276";
		assertEquals("tan(-276.0)= 9.514372",tan.tangent(msg));
	}
	
	@Test
	public void testTangentFunction4() {
		String msg="186.3";
		assertEquals("tan(186.3)= 0.110401",tan.tangent(msg));
	}
	
	@Test
	public void testTangentFunction5() {
		String msg="-28.7";
		assertEquals("tan(-28.7)= -0.547484",tan.tangent(msg));
	}
}
