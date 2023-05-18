package fp.lamda;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamda {
    public static void main(String[] args) {
        MyLamda myLamda = (int a,int b)-> a<b ? a:b;
        System.out.println(new NotLamda() {
            public int min(int a, int b) {
                return a < b ? a : b;
            }
        }.min(3, 5));
        System.out.println(myLamda.min(3,5));//3

        //supplier
        Supplier<String> supplier = () -> "supplier";
        System.out.println(supplier.get());//supplier

        //consumer
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
        Consumer<String> consumer2 = (str) -> System.out.println(str.toLowerCase());
        consumer.andThen(consumer2).accept("Hello World");
        //HELLO WORLD
        //hello world

        //function
        Function<String,Integer> function = (str) -> {System.out.println(str.length());
            return str.length();};
        Function<String,String> function2 = (str) -> {System.out.println(str+str);
            return str+str;};
        function.compose(function2).apply("hello");
        //hellohello
        //10


        //predicate
        Predicate<String> predicate = (str) -> str.equals("Hello World");
        System.out.println(predicate.test("Hello World"));//true


        //일반 메소드 참조
        // 메소드 참조로 변경
        Function<String, Integer> function3 = String::length;
        System.out.println(function3.apply("Hello World"));//11


        //instance 메소드 참조
        // 일반 메소드를 참조하여 Consumer를 선언한다.
        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Hello World!!");//Hello World출력

        //instance 메소드 참조 이것은 불가
//        String str2 = new String();
//        Function<String, Integer> function4 = str2::length;
//        System.out.println(function4.apply("Hello World"));//11

        //생성자 참조
        Supplier<Object> supplier2 = Object::new;
    }

}
