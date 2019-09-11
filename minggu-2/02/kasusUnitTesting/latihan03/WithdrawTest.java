/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package latihan03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class WithdrawTest {
    
    public WithdrawTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setWithdraw method, of class Withdraw.
     */
    @Test
    public void testSetWithdraw() {
        System.out.println("setWithdraw");
        double w = 0.0;
        Withdraw instance = new Withdraw();
        instance.setWithdraw(w);

    }

    /**
     * Test of getWithdraw method, of class Withdraw.
     */
    @Test
    public void testGetWithdraw() {
        System.out.println("getWithdraw");
        double expResult = 0.0;
        double result = Withdraw.getWithdraw();
        assertEquals(expResult, result, 0.0);

    }
    
}
