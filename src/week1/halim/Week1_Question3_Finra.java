package week1.halim;
/*
FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number

 */

public class Week1_Question3_Finra {

    public static void main(String[] args) {
        // call method
        finra();
    }
    // method to calculate fin ra
    private static void finra() {
        // empty String to concatenate each number from 1-30 with fin and ra
        String result = "";
        // for loop from 1 to 30
        for(int i=1; i <= 30; i++) {
            // condition to check and print
            // check if each number is divisible by 3 and/or 5
            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "
                    :(i%3 == 0) ? "FIN " : i+" ";
        }
        // print final result
        System.out.println(result);

    }
}
