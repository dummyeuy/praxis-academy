/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package IntroductionToThreadsAndConcurrency;

/**
 *
 * @author asus
 */
public class LocalSync {
    private Integer sync = 0;
 
    public void someMethod() {
        synchronized (sync) {
            // synchronized on instance level
        }
    }
}

