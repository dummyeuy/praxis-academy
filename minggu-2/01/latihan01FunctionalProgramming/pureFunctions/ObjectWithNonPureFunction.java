/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package pureFunctions;

/**
 * source code diperoleh dari http://tutorials.jenkov.com/java-functional-programming/index.html
 * @author dummyeuy
 */
public class ObjectWithNonPureFunction{
    static int value = 0;

    static int add(int nextValue) {
        value += nextValue;
        return value;
    }
    public static void main(String[] args){
        System.out.println(add(1));
    }
           
}
