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
//String.format("%s", ...) : This method is used to format strings. In this case, it's formatting a string with a single placeholder (%s). The %s is a format specifier for a string. The value inside the parentheses after the comma is the argument that will be substituted into the placeholder.
//
//Putting it all together:
//
//If number is even, the ternary operator returns "Even".
//If number is odd, the ternary operator returns "Odd".
//The result is then passed to String.format, which formats it as a string using the %s placeholder. The entire expression is then returned as the result of the identify method.
//
//So, this method takes an integer as input, determines whether it's even or odd, and returns the result as a string ("Even" or "Odd").