package fp.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class MyStream2 {
    public static void main(String[] args) {

        //1. 스트림 생성학기

        //Collection Straem
        List<String> list = Arrays.asList("1", "2", "3");
        Stream<String> stream = list.stream();

        //Array Stream
        Stream<String> stream1 = Stream.of("1", "2", "3"); //가변인자
        Stream<String> stream2 = Stream.of(new String[]{"1", "2", "3"});
        Stream<String> stream3 = Arrays.stream(new String[]{"1", "2", "3"});
        Stream<String> stream4 = Arrays.stream(new String[]{"1", "2", "3"}, 0, 3); //end범위 포함 x

        //원시 Stream
        // 4이상 10 이하의 숫자를 갖는 IntStream
        IntStream stream5 = IntStream.range(4, 10);


        //2.Stream 가공하기(중간 연산)

        //filter
        Stream<String> stream6 =
                list.stream()
                        .filter(num -> num.contains("1"));

        //map
        Stream<String> stream7 =
                list.stream()
                        .map(num -> num + " 12");

        //sort
        //내림차순
        Stream<String> stream8 = list.stream()
                .sorted(Comparator.reverseOrder());//3,2,1

        //중복제거 distinct
        List<String> list2 = Arrays.asList("1", "2", "3","1");
        Stream<String> stream9 = list2.stream()
                .distinct();//1,2,3
        stream9.forEach(System.out::println);

        //peek
        //peek으로 값 확인만하고 이후에는 그냥 정상수행
        int sum = IntStream.of(1, 3, 5, 7, 9)
                .peek(System.out::println)
                .sum();





        //3. 최종 연산

        //Max,min,sum,average,count
        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        int max = IntStream.of().max().orElse(0);
        IntStream.of(1, 3, 5, 7, 9).average().ifPresent(System.out::println);
        long count = IntStream.of(1, 3, 5, 7, 9).count();
        long sum2 = LongStream.of(1, 3, 5, 7, 9).sum();

        //Collector.toList()

        List<String> numList = list2.stream()
                .map(num -> num+"131")
                .collect(Collectors.toList());


        //Collectors.joining()

        String listToString = list2.stream()

                .collect(Collectors.joining());
// 1231

        String listToString2 = list2.stream()
                .collect(Collectors.joining(" "));
// 1 2 3 1

        String listToString3 = list2.stream()
                .collect(Collectors.joining(", ", "<", ">"));
// <1, 2, 3, 1>

        System.out.println(listToString + listToString2 + listToString3);

        //Match

        List<String> names = Arrays.asList("song", "young", "woo");

        boolean anyMatch = names.stream()
                .anyMatch(name -> name.contains("w"));
        boolean allMatch = names.stream()
                .allMatch(name -> name.contains("o"));
        boolean noneMatch = names.stream()
                .noneMatch(name -> name.endsWith("b"));

        //forEach
        list2.stream().forEach(System.out::println);
    }
}
