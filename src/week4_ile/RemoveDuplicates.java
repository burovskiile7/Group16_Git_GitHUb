package week4_ile;

public class RemoveDuplicates {

        public static String removeDup(String input) {
            if (input == null || input.isEmpty()) {
                return "";
            }

               StringBuilder result = new StringBuilder();
                   result.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                 result.append(input.charAt(i));
                }
            }

          return result.toString();
        }

             public static void main(String[] args) {
                System.out.println(removeDup("AAABBBCCC")); // ABC
        }
    }
    // add comment

