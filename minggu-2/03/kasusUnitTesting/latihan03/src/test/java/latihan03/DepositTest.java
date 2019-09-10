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
public class DepositTest {
    
    public DepositTest() {
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
     * Test of setDeposit method, of class Deposit.
     */
    @Test
    public void testSetDeposit() {
        System.out.println("setDeposit");
        double d = 0.0;
        Deposit instance = new Deposit();
        instance.setDeposit(d);

    }

    /**
     * Test of getDeposit method, of class Deposit.
     */
    @Test
    public void testGetDeposit() {
        System.out.println("getDeposit");
        double expResult = 0.0;
        double result = Deposit.getDeposit();
        assertEquals(expResult, result, 0.0);

    }
    
}
