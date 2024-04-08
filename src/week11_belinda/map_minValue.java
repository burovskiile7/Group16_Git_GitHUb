package week11_belinda;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class map_minValue {
    public static void main(String[] args) {


        Map<String, Double> map = new HashMap<>();
        map.put("a",0.5);
        map.put("b",7.7);
        map.put("c",3.9);

        Double min = Collections.min(map.values());
        System.out.println(min);




    }
}
