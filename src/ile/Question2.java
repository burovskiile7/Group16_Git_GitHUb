package ile;

public class Question2 {

    //Second task for week2
    // numbers divisible by 3, 5, 15

    public static void main(String[] args) {


        System.out.println("Divisible by 15: ");

        for (int i = 15; i <= 100; i += 15) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Divisible By 5:");
        for (int i = 5; i <= 100; i += 5) {
            if (i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Divisible By 3:");
        for (int i = 3; i <= 100; i += 3) {
            if (i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Numbers divisible by 3, 5, and 15:");
        for (int i = 30; i <= 100; i += 30) {
            System.out.print(i + " " + (i + 15) + " ");
        }
        System.out.println();


// update new code


    }






    }

