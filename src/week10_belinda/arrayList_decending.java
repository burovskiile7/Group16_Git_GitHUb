package week10_belinda;

import java.util.ArrayList;

public class arrayList_decending {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(101);
        list.add(201);
        list.add(301);
        list.add(401);
        list.add(501);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }


    }
}
