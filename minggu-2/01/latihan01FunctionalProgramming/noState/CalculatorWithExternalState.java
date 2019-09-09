/*
 * This project is contributed or modified by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package noState;

/**
 * source code diperoleh dari http://tutorials.jenkov.com/java-functional-programming/index.html
 * @author dummyeuy
 */
public class CalculatorWithExternalState {
        static int initVal = 5;
    static int sum(int a) {
       return initVal + a;
    }
    public void setBarang(int kodeBarang, String namaBarang, float harga) {
    }
    public static void main(String[] args) {
        System.out.println(sum(2));
    }
}