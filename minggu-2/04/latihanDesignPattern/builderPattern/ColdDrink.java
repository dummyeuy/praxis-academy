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
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}