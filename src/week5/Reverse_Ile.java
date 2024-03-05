package week5;

public class Reverse_Ile {
        public static String reverse(String input) {
            StringBuilder reversed = new StringBuilder();

            // Iterate through the input string from the end to the start  /
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            String input = "ABCDE";
            String reversedString = reverse(input);
            System.out.println("Reversed string: " + reversedString);  // The Output will be: EDCBA

        }

    }

