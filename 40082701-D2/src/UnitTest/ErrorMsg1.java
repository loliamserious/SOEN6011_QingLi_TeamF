package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import TangentFunction.*;

/**
 * Unit Test for error handling type1-illegal input
 * @author Qing Li SID:40082701
 */

public class ErrorMsg1 {
	private TangentFunction tan= new TangentFunction();
	
	@Test
	public void testEmptyInput() {
		String msg="";
		assertEquals("Error: Empty input!",tan.tangent(msg));
	}
	
	@Test
	public void testNonRealNumberInput1() {
		String msg="1a2";
		assertEquals("Error: This is not a real number!",tan.tangent(msg));
	}
	
	@Test
	public void testNonRealNumberInput2() {
		String msg="dhkls";
		assertEquals("Error: This is not a real number!",tan.tangent(msg));
	}
	
	@Test
	public void testNonRealNumberInput3() {
		String msg="**5";
		assertEquals("Error: This is not a real number!",tan.tangent(msg));
	}
	
	@Test
	public void testNonRealNumberInput4() {
		String msg="\\1";
		assertEquals("Error: This is not a real number!",tan.tangent(msg));
	}
	
	@Test
	public void testNonRealNumberInput5() {
		String msg="%$!";
		assertEquals("Error: This is not a real number!",tan.tangent(msg));
	}
}
