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
class ObjectWithPureFunction{
    
    static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,100));
    }
}
