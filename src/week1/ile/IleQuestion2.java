package week1.ile;

public class IleQuestion2 {

    // Divide without / operator
        public static void main(String[] args) {
            System.out.println(divide(124, 6));
        }

        public static int divide(int d1, int d2) {
            int result = 0;
            while (d1 >= d2) {
                d1 -= d2;
                result++;
            }
            return result;
        }
    }
