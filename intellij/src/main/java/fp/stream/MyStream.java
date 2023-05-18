package fp.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        // Stream 사용 전

        String[] nameArr = {"super", "dev", "Song"};
        List<String> nameList = Arrays.asList(nameArr);

        // 원본의 데이터가 직접 정렬됨
        Arrays.sort(nameArr);
        Collections.sort(nameList);

        for (String str: nameArr) {
            System.out.println(str);
        }

        for (String str : nameList) {
            System.out.println(str);
        }

        // Stream 사용 후


        String[] nameArr2 = {"super", "dev", "Song"};
        List<String> nameList2 = Arrays.asList(nameArr);

        // 원본의 데이터가 아닌 별도의 Stream을 생성함
        Stream<String> nameStream = nameList.stream();
        Stream<String> arrayStream = Arrays.stream(nameArr);

        // 복사된 데이터를 정렬하여 출력함
        nameStream.sorted().forEach(System.out::println);
        arrayStream.sorted().forEach(System.out::println);


        //사용한 stream 또 사용시
        //nameStream.sorted().forEach(System.out::println);//에러발생


        //stream api 3단계 예시


        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()							// 생성하기
                .filter(s -> s.startsWith("c"))			// 가공하기
                .map(String::toUpperCase)			// 가공하기
                .sorted()							// 가공하기
                .count();

    }
}
