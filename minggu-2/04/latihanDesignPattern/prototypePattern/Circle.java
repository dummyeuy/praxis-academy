/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package prototypePattern;

/**
 * source code diperoleh dari https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
 * @author dummyeuy
 */
public class Circle extends Shape {

   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}