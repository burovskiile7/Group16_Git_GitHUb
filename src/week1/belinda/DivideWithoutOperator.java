package week1.belinda;

public class DivideWithoutOperator {
    public static void main(String[] args) {


        int b1 = 1000;
        int b2 = 6;
        int result = 0;

        while ( b1>=b2 ){
            b1 -= b2;
            result++;
        }
        System.out.println(result);
    }
}
