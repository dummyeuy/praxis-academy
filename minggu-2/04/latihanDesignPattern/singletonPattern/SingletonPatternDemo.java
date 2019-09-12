/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package singletonPattern;

/**
 * source code diperoleh dari https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 * @author dummyeuy
 */
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
   }
}

//Hello World!
//BUILD SUCCESSFUL (total time: 2 seconds)
