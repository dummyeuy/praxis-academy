/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package vending;

/**
 * Declare public API for Vending Machine
 * @author Javin Paul
 * source code diperoleh dari https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5ygB15BRz
 */ 
public class SoldOutException extends RuntimeException {
    private String message;
    
    public SoldOutException(String string) {
        this.message = string;
    }
    
    @Override public String getMessage(){
        return message;
    }
}
