package week5;

public class Find_a_unique_Ile {
        public static String findUnique(String input) {
            StringBuilder uniqueChars = new StringBuilder();

            // I use For loop -> it will Iterate through each character in the input string
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                // Check if the character is unique
                if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                    uniqueChars.append(currentChar);
                }
            }

            return uniqueChars.toString();
        }

        public static void main(String[] args) {
            String input = "ABBBCCCDEF";
            String unique = findUnique(input);
            System.out.println("Unique characters: " + unique);  // The output will be: ADEF
        }
    }
