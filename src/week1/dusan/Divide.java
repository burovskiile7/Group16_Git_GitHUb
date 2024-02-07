package week1.dusan;

public class Divide {

    public static void main(String[] args) {

        int divident = 200;
        int divisor = 20;
        int result = 0;
        while(divident >= divisor){
            divident -= divisor;
            result++;
        }

        System.out.println(result);


    }
}
