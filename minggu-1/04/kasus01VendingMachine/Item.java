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
public enum Item{
    COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45);
    private String name;
    private int price;
    
    private Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public long getPrice(){
        return price;
    }
}
