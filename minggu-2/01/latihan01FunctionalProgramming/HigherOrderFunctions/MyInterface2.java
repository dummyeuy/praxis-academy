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
public interface MyInterface2{
    public void run();

    public default void doIt() {
        System.out.println("doing it");
    }

    public static void doItStatically() {
        System.out.println("doing it statically");
    }
}
