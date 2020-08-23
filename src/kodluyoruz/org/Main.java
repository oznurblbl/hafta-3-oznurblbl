package kodluyoruz.org;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<Integer>();

        System.out.println(list);

        for (int i = 0; i < 32; i++) {
            list.add(i);
            System.out.println(list);
        }

       // list.insert(8, 30);
       // System.out.println(list);

        //list.contains(5);
        //list.IndexOf(5);

    }
}
