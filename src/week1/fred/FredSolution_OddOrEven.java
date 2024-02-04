package week1.fred;

public class FredSolution_OddOrEven {
    public static void main(String[] args) {
        System.out.println(identify(5));  // Output: "Odd"
        System.out.println(identify(6));  // Output: "Even"
    }

    public static String identify(int number) {
        return String.format("%s", (number % 2 == 0) ? "Even" : "Odd");
    }
}
