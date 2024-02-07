package weeklyTasks;

public class week02 {
    public static void printNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            if (isDivisibleBy2(i) && isDivisibleBy3(i) && isDivisibleBy5(i)) {
                System.out.println("CodilityTestCoders");
            } else if (isDivisibleBy2(i) && isDivisibleBy3( i )) {
                System.out.println("CodilityTest");
            } else if (isDivisibleBy2(i) && isDivisibleBy5( i )) {
                System.out.println("CodilityCoders");
            } else if (isDivisibleBy3(i) && isDivisibleBy5( i )) {
                System.out.println("TestCoders");
            } else if (isDivisibleBy2(i)) {
                System.out.println("Codility");
            } else if (isDivisibleBy3(i)) {
                System.out.println("Coders");
            } else if (isDivisibleBy5(i)) {
                System.out.println("Test");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isDivisibleBy2(int number) {
        return number % 2 == 0;
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;//it was challenging
    }

    public static void main(String[] args) {
        printNumbers(24);//25//30
    }


}









