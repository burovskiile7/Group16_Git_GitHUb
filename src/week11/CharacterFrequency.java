package week11;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "Hello World!";
        printCharacterFrequency(inputString);
    }

    public static void printCharacterFrequency(String inputString) {
        //I'm creating a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        //I'm cunting the frequency of each character
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            // If the character is already in the map, increment its count by 1
            if (frequencyMap.containsKey(currentChar)) {
                frequencyMap.put(currentChar, frequencyMap.get(currentChar) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                frequencyMap.put(currentChar, 1);
            }
        }

        // Printing the frequency of each character
        for (char c : frequencyMap.keySet()) {
            System.out.println("Character: " + c + ", Frequency: " + frequencyMap.get(c));
        }
    }
}
