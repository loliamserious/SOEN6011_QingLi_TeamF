package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

public class ErrorMsg1 {
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testEmptyInput() {
		String msg="";
		assertEquals("Error Input: Empty input!",tan.tangent(msg));
	}
	
	@Test
	public void testNonRealNumberInput() {
		String msg="1a2";
		assertEquals("Error Input: This is not a real number, you should input a real number!",tan.tangent(msg));
	}

}
