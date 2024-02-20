package week4_ile;

import java.util.HashMap;
import java.util.Map;
public class SameLetters {

        public static boolean same(String input1, String input2) {
            if (input1 == null || input2 == null || input1.length() != input2.length()) {
              return false;
            }

            Map<Character, Integer> charCountMap = new HashMap<>();

            for (char c : input1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for (char c : input2.toCharArray()) {
                if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
               return false;
                }
                charCountMap.put(c, charCountMap.get(c) - 1);
            }
            return true;
        }
        public static void main(String[] args) {
            System.out.println(same("abc", "cab")); // true
            System.out.println(same("abc", "abb")); // false
            System.out.println(same("java", "avaj")); // true
            System.out.println(same("coding", "odingc")); // true
        }
    }
// add comment
