package week10_belinda;

import java.util.ArrayList;

public class arrayList_ascending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(65);

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
