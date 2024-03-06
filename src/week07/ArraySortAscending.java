package week07;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] array = {10,9,8,7};

        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}
