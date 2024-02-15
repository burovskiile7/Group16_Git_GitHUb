package week3.ile;

public class Task02 {

    //Check if the number is prime number or not

        // here i have isPrime method to check if a number is prime
        static boolean isPrime(int n) {
            for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
            return n > 1;
        }

        // Here i have a main method to test the isPrime method
        public static void main(String[] args) {
            int[] testNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
            for (int num : testNumbers) System.out.println(num + (isPrime(num) ? " is prime." : " is not prime."));
        }
    }
