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
import java.util.Scanner;
import static org.junit.Assert.*;

/**
 *
 * @author asus
 */
public class ATMMachineTest {
    
    public ATMMachineTest() {
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
     * Test of checkBalance method, of class ATMMachine.
     */
    @Test
    public void testCheckBalance() {
        System.out.println("checkBalance");
        ATMMachine.checkBalance();

    }

    /**
     * Test of withdrawMoney method, of class ATMMachine.
     */
    @Test
    public void testWithdrawMoney() {
        System.out.println("withdrawMoney");
        ATMMachine.withdrawMoney();

    }

    /**
     * Test of depositMoney method, of class ATMMachine.
     */
    @Test
    public void testDepositMoney() {
        System.out.println("depositMoney");
        ATMMachine.depositMoney();

    }

    /**
     * Test of main method, of class ATMMachine.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
//      ATMMachine.main(args);
      ATMMachine atm = new ATMMachine();
      atm.main(args);
    }
    
}
