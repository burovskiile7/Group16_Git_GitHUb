package week4_ile;

import java.util.HashMap;
import java.util.Map;
public class FrequencyOfChar {

        public static String frequencyOfChars(String input) {
            if (input == null || input.isEmpty()) {
                return "";
            }

             StringBuilder result = new StringBuilder();
            Map<Character, Integer> charCountMap = new HashMap<>();

              for (char c : input.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

             for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }
            return result.toString();
        }
      public static void main(String[] args) {
            System.out.println(frequencyOfChars("AAABBCDDDE")); // A3B2C1D3E1
        }
    }
// add comment
