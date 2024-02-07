package week1.halim;

/*
Write a method that can divide two numbers without using division operator
 */

public class Week1_Question2_Divide {

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 2;

        // call method with 2 arguments
        divideNums(num1,num2);

    }
    // Method to divide 2 numbers (can be public)
    private static void divideNums(int n1, int n2) {
        // Handle the possibility of n2=0 which will result exception
        if (n2==0){
            System.out.println("Invalid number : 0");
            System.exit(0);
        }
        // count how many times n2 is in n1
        int counter = 0;

        while(n1 >= n2){
            n1 -= n2;
            counter++;
        }
        System.out.println("n1 has " + counter + " times n2 and the remainder is " + n1);
    }
}
