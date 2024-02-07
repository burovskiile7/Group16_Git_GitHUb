package week1.dilnoz;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 25;

        boolean isEven = num % 2 == 0;
        boolean isOdd = !isEven;

        System.out.println(num + " is an even number: " + isEven);
        System.out.println(num + " is an odd number: " + isOdd);
    }
}
