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
public class Bucket<E1, E2> {
    private E1 first;
    private E2 second;
    
    public Bucket(E1 first, E2 second){
        this.first = first;
        this.second = second;
    }
    
    public E1 getFirst(){
        return first;
    }
    
    public E2 getSecond(){
        return second;
    }
}