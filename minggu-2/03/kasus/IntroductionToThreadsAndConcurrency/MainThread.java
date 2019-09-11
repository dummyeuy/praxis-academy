/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package IntroductionToThreadsAndConcurrency;

import java.lang.Thread.State;

/**
 *
 * @author asus
 */
public class MainThread {
     
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        State state = Thread.currentThread().getState();
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();
        System.out.println("id="+id+"; name="+name+"; priority="+priority+"; state="+state+"; threadGroupName="+threadGroupName);
    }
}

//id=1; name=main; priority=5; state=RUNNABLE; threadGroupName=main
//BUILD SUCCESSFUL (total time: 0 seconds)