package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

/**
 * Unit Test for power function
 * @author Qing Li SID:40082701
 */

public class PowerTest {
	
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testPowerFunction1(){
		double x=19;
		int n=9;
		assertEquals(3.22687697779E11,tan.pwr(x, n),1e-6);
	}
	
	@Test
	public void testPowerFunction2() {
		double x=-9;
		int n=11;
		assertEquals(-3.1381059609E10,tan.pwr(x, n),1e-6);
	}
	
	@Test
	public void testPowerFunction3() {
		double x=5.6;
		int n=21;
		assertEquals(5.151676304086643E15,tan.pwr(x, n),1e-6);
	}
}
