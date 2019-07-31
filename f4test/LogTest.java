package project6011;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LogTest {

  @Before
  public void setUp() throws Exception {}

  /**
   * Mylog() is to calculate ln(x).
   */


  /**
   * testMylog1() is to verify when x>1.
   */
  @Test
  public void testMylog1() {

    assertEquals(1.6094, Log.Mylog(5), 0.01);
  }

  /**
   * testMylog2() is to verify when x>10.
   */
  @Test
  public void testMylog2() {

    assertEquals(3.4657, Log.Mylog(32), 0.01);
  }

  /**
   * testMylog3() is to verify when x>100.
   */
  @Test
  public void testMylog3() {

    assertEquals(5.2832, Log.Mylog(197), 0.01);
  }

  /**
   * testMylog4() is to verify when x>0 && x<=1.
   */
  @Test
  public void testMylog4() {

    assertEquals(-0.6931, Log.Mylog(0.5), 0.01);
  }

  /**
   * testMylog5() is to verify when x>0 && x<=1.
   */
  @Test
  public void testMylog5() {

    assertEquals(0.0000, Log.Mylog(1), 0.01);
  }


}
