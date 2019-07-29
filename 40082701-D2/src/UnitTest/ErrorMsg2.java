package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

/**
 * Unit Test for error handling type2-non exist value
 * @author Qing Li SID:40082701
 */

public class ErrorMsg2 {
	
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testNonExistError1() {
		String msg="90";
		assertEquals("Error: The value is not existing!",tan.tangent(msg));
	}
	
	@Test
	public void testNonExistError2() {
		String msg="180";
		assertEquals("Error: The value is not existing!",tan.tangent(msg));
	}
	
	@Test
	public void testNonExistError3() {
		String msg="360";
		assertEquals("Error: The value is not existing!",tan.tangent(msg));
	}
}
