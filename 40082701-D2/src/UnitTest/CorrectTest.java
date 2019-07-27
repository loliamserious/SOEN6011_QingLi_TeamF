package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

public class CorrectTest {
	
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testCorrectResult() {
		String msg="45";
		assertEquals("tan(45.0)= 1.000000",tan.tangent(msg));
	}
}
