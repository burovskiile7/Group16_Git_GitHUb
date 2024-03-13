package week3.ile;
public class ReverseNegativeNumber {

    //Reverse negative number
        public static int reverseNegative(int num) {
             if (num < 0) {
                  num = -num;
                 int reversedNum = 0;
                 while (num != 0) {
                    reversedNum = reversedNum * 10 + num % 10;
                    num /= 10;
                }
                 return -reversedNum;
             } else {
                 return num;
            }
        }
        public static void main(String[] args) {
            int negativeNumber = -12345;
             int reversedNumber = reverseNegative(negativeNumber);
            System.out.println("Original Negative Number: " + negativeNumber);
              System.out.println("Reversed Negative Number: " + reversedNumber);

            System.out.println("Original negative number: " + negativeNumber);
             System.out.println("Reversed negative number: " + reversedNumber);
             //update
        }
    }
//add comment