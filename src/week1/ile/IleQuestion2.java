package week1.ile;

public class IleQuestion2 {

    // Divide without / operator
        public static void main(String[] args) {
            System.out.println(divide(124, 6));
        }

        public static int divide(int dividend, int divisor) {
            int result = 0;
            while (dividend >= divisor) {
                dividend -= divisor;
                result++;
            }
            return result;
        }
    }
