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
public class BuilderPatternDemo {
   public static void main(String[] args) {
   
      MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
   }
}
//Veg Meal
//Item : Veg Burger, Packing : Wrapper, Price : 25.0
//Item : Coke, Packing : Bottle, Price : 30.0
//Total Cost: 55.0
//
//
//Non-Veg Meal
//Item : Chicken Burger, Packing : Wrapper, Price : 50.5
//Item : Pepsi, Packing : Bottle, Price : 35.0
//Total Cost: 85.5
//BUILD SUCCESSFUL (total time: 3 seconds)
