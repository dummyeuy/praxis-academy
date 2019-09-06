/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package vending;
import java.util.HashMap;
import java.util.Map;

/**
 * Declare public API for Vending Machine
 * @author Javin Paul
 * source code diperoleh dari https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5ygB15BRz
 */ 
public class Inventory<T> {
    private Map<T, Integer> inventory = new HashMap<T, Integer>();
    
    public int getQuantity(T item){
        Integer value = inventory.get(item);
        return value == null? 0 : value ;
    }
    public void add(T item){
        int count = inventory.get(item);
        inventory.put(item, count+1);
    } public void deduct(T item) {
        if (hasItem(item)) {
            int count = inventory.get(item);
            inventory.put(item, count - 1);
        }
    }
    
    public boolean hasItem(T item){
        return getQuantity(item) > 0;
    }
    
    public void clear(){
        inventory.clear();
    }
    
    public void put(T item, int quantity) {
        inventory.put(item, quantity);
    }
}
