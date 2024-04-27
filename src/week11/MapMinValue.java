package week11;

import java.util.Map;

public class MapMinValue {

    public static <K, V extends Comparable<V>> V findMinValue(Map<K, V> map) {
        V minValue = null ;

        for (V value : map.values()) { // Iterate through the values in the map
            if (minValue == null || value.compareTo(minValue) < 0)  {
                minValue = value ;
            }
        }

        return minValue; // return the min value
    }

    public static void main(String[] args) {

        // Example usage
        Map<String, Integer> sampleMap = Map.of("A", 5, "B", 3, "C", 8, "D", 1);
        Integer minValue = findMinValue(sampleMap);
        System.out.println("Minimum value in the map: " + minValue);
    }

}
