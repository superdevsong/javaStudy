package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Node implements Comparable<Node>{
    public int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }
}

class Node2 {
    public int value;

    public Node2(int value) {
        this.value = value;
    }

}


public class CompareStudy {
    public static void main(String[] args) {

        //Comparable
        List<Node> list = new ArrayList<>();

        for(int i=5;i>0;i--){
            list.add(new Node(i));
        }
        list.stream().forEach(node -> System.out.print(node.value));//54321

        System.out.println();

        list.sort(null);

        list.stream().forEach(node -> System.out.print(node.value));//12345

        System.out.println();

        //Comparator

        List<Node2> list2 = new ArrayList<>();

        for(int i=5;i>0;i--){
            list2.add(new Node2(i));
        }

        Comparator<Node2> comp = new Comparator<Node2>() {
            @Override
            public int compare(Node2 o1, Node2 o2) {
                return o1.value-o2.value;
            }
        };

        list2.stream().forEach(node -> System.out.print(node.value));//54321

        System.out.println();

        list2.sort(comp);

        list2.stream().forEach(node -> System.out.print(node.value));//12345

    }

}
