/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package higherOrderFunctions;

/**
 *
 * @author asus
 */
public class MyInterface implements MyInterface2{
    public void run(){
        System.out.println("Bismillah bisa ke-run");
    }
    
    public static void main(String[] args) {
        MyInterface a = new MyInterface();
        a.doIt();
        MyInterface2.doItStatically();
    }
    
}