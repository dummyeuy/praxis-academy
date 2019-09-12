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
public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());		

      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());		

      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());		
   }
}

//Shape : Circle
//Shape : Square
//Shape : Rectangle
//BUILD SUCCESSFUL (total time: 0 seconds)