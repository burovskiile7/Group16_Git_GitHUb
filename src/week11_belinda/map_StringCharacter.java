package week11_belinda;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class map_StringCharacter {
    public static void main(String[] args) {


        String str = "bbcccaaddf";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            map. put(each, frequency);
        }

        System.out.println(map);



    }
}
