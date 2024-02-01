package week1.halim;

public class Week1_Question1_OddOrEven {
    /*
    Write  a method which can identifies given number is even or odd
     */

    public static void main(String[] args) {
        System.out.println(identifyOddEven(5));

    }
    public static String identifyOddEven(int n) {
        return n%2==0 ? "Even" : "odd" ;
    }


}
