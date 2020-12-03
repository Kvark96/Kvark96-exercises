public class Calculator {
    public static void calculate(int a, int b) throws IllegalArgumentException {
        if(a < 51 && a > 0 && b < 51 && b > 0){
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a-b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a * b = " + (a*b));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
