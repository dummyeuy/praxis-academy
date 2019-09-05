/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package latihan03;

/**
 * source code diperoleh dari https://eturo.blogspot.com/2012/01/tutorial-simple-atm-machine-program-in.html
 * @author dummyeuy
 */

public class Withdraw extends ATMMachine
{
    static double withdraw = 0;    
    public void setWithdraw(double w)
    {
        withdraw = w;
    }
    public static double getWithdraw()
    {
        return withdraw;
    }
}