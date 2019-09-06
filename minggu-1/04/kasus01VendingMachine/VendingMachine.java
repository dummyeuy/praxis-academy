/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package vending;

import java.util.List;
/**
 * Declare public API for Vending Machine
 * @author Javin Paul
 * source code diperoleh dari https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#ixzz5ygB15BRz
 */ 
public interface VendingMachine {
        public long selectItemAndGetPrice(Item item);
        public void insertCoin(Coin coin);
        public List<Coin> refund();
        public Bucket<Item, List<Coin>> collectItemAndChange();
        public void reset();
}
