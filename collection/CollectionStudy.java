package collection;

import java.util.*;

public class CollectionStudy {
    public static void main(String[] args) {
        LinkedList<Integer> lnkList = new LinkedList<Integer>();

        lnkList.add(12);

        lnkList.add(42);

        lnkList.add(33);

        lnkList.add(21);

        Iterator<Integer> iter = lnkList.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");//12 42 33 21
        }
    }
}
