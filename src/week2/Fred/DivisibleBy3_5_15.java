package week2.Fred;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Divisible by 15:");
        for (int i = 15; i < 100; i += 15) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Divisible by 3");
        for (int i = 3; i < 100; i += 3) {
            if (i % 15 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("Divisible by 5");
        for (int i = 5; i < 100; i+=5) {
            if(i % 15 !=0);
            System.out.print(i + " ");
        }
    }
}

