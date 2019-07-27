package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

public class ErrorMsg2 {
	
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testNonExistError() {
		String msg="90";
		assertEquals("Error: The value for tan(x) where x=��/2+k��(for all integer k) is not existing!",tan.tangent(msg));
	}
}
