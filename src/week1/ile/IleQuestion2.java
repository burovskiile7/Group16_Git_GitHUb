package week1.ile;

public class IleQuestion2 {

    // Divide without / operator

    public static void main(String[] args) {
        int dividend = 1000;
        int divisor = 14;
        int result = divide(dividend, divisor);
        System.out.println("Result: " + result);
    }

    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }
}
