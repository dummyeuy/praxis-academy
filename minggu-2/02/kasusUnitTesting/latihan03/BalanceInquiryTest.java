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
public class BalanceInquiryTest {
    
    public BalanceInquiryTest() {
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
     * Test of setBalance method, of class BalanceInquiry.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double b = 0.0;
        BalanceInquiry instance = new BalanceInquiry();
        instance.setBalance(b);

    }

    /**
     * Test of getBalance method, of class BalanceInquiry.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        double expResult = 0.0;
        double result = BalanceInquiry.getBalance();
        assertEquals(expResult, result, 0.0);

    }
    
}
