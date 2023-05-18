package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListStudy {
    public static void main(String[] args) {
        //Vector
        List<String> vectorList = new Vector<>();
        vectorList.add("1");//추가
        vectorList.set(0,"2");//갱신
        vectorList.get(0);//가져오기
        vectorList.remove(0);//삭제
        //vector 동기화의 장점을 갖지만 레거시한 코드라 성능적으로 좋지않음
        //해결방안 더 안전하고 좋은 성능의 동기화를 제공하는 CopyOnWriteArrayList
        List<String> copyLIst = new CopyOnWriteArrayList<>();

        //ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");//추가
        arrayList.add("2");//추가
        arrayList.add("3");//추가
        arrayList.remove(1);//"2"삭제
        arrayList.get(1);//"2"삭제되고 그 자리에 "3"채워져서 "3"가져옴

        //LinnkedList

        List<String> linkedList = new LinkedList<>();
        linkedList.add("1");//추가
        linkedList.add("2");//추가
        linkedList.add("3");//추가
        linkedList.remove(1);//"2"삭제
        linkedList.get(1);//값을 가져올때는 link를 타고 계속해서 이동해야됨

        //Stack
        Stack<String> stack = new Stack<>();
        stack.push("1");//추가
        stack.push("2");//추가
        stack.push("3");//추가
        stack.peek();//"3" 가져옴
        stack.pop();//"3"내보내면서 지움
        //레거시하고 단일스레드에서는 성능이 좋지 않다.
        //해결방안 Deque
        Deque<String> arraydeque = new ArrayDeque<>();
        arraydeque.push("1");//추가
        arraydeque.push("2");//추가
        arraydeque.push("3");//추가
        arraydeque.peek();//"3" 가져옴
        arraydeque.pop();//"3"내보내면서 지움










    }
}
