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
public class MyThread extends Thread {
     
    public MyThread(String name) {
        super(name);
    }
 
    @Override
    public void run() {
        System.out.println("Executing thread "+Thread.currentThread().getName());
    }
     
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("myThread");
        myThread.start();
    }
}

//Executing thread myThread
//BUILD SUCCESSFUL (total time: 0 seconds)