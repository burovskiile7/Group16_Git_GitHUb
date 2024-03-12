package week07;

public class ArrayFindMin {
    public static void main(String[] args) {
        int[] number = {150, 30, 510, 45, 10, 130};

        int min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("min: " + min);
    }
}