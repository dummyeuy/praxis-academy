/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package IntroductionToThreadsAndConcurrency;

import java.util.Random;

/**
 *
 * @author asus
 */
public class JoinExample implements Runnable {
    private Random rand = new Random(System.currentTimeMillis());
 
    public void run() {
        //simulate some CPU expensive task
        for(int i=0; i<100000000; i++) {
            rand.nextInt();
        }
        System.out.println("["+Thread.currentThread().getName()+"] finished.");
    }
 
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for(int i=0; i<threads.length; i++) {
            threads[i] = new Thread(new JoinExample(), "joinThread-"+i);
            threads[i].start();
        }
        for(int i=0; i<threads.length; i++) {
            threads[i].join();
        }
        System.out.println("["+Thread.currentThread().getName()+"] All threads have finished.");
    }
}

//[joinThread-1] finished.
//[joinThread-3] finished.
//[joinThread-0] finished.
//[joinThread-4] finished.
//[main] All threads have finished.
//BUILD SUCCESSFUL (total time: 5 seconds)
