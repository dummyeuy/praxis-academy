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
public class MyRunnable implements Runnable {
 
    public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }
     
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable(), "myRunnable");
        myThread.start();
    }
}

//Executing thread myRunnable
//BUILD SUCCESSFUL (total time: 0 seconds)