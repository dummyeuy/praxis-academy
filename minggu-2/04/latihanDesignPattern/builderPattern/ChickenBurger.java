/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package builderPattern;

/**
 * source code diperoleh dari https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * @author dummyeuy
 */
public class ChickenBurger extends Burger {

   @Override
   public float price() {
      return 50.5f;
   }

   @Override
   public String name() {
      return "Chicken Burger";
   }
}