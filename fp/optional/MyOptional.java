package fp.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MyOptional {
    public static Integer num;

    public static Integer getNum(){
        return num;
    }

    //orElse와 orElseGet의 차이 예시 코드

    public void findUserEmailOrElse() {
        String userEmail = "Empty";
        String result = Optional.ofNullable(userEmail)
                .orElse(getUserEmail());
        //getUserEmail() Called
        System.out.println(result);//Empty
    }

    public void findUserEmailOrElseGet() {
        String userEmail = "Empty";
        String result = Optional.ofNullable(userEmail)
                .orElseGet(this::getUserEmail);

        System.out.println(result);//Empty
    }

    private String getUserEmail() {
        System.out.println("getUserEmail() Called");
        return "superdevsong@github.io";
    }
    public static void main(String[] args) {

        //empty
        Optional<Integer> optional = Optional.empty();
        System.out.println(optional);//Optional.empty
        System.out.println(optional.isPresent());//값이 없으므로 false

        //null이 절대 아니다.
        Optional<Integer> optional2 = Optional.of(12);

        // Optional의 value는 값이 있을 수도 있고 null 일 수도 있다.
        Optional<Integer> optional3 = Optional.ofNullable(getNum());
        int number = optional3.orElse(12); // 값이 없다면 12 를 리턴

        //Optional 예시1 null인지 검사하고 널일경우 새로운 값을 할당해주는 과정

        // Java8 이전
        Integer number2 = getNum();
        Integer tempNames = number2 != null
                ? number2
                : 12;
        //Optional 사용
        int number3 = Optional.ofNullable(getNum())
                .orElseGet(()->12);

        //Optional 예시2 숫자를 받고 값이 null이면 NoSuchElementException을 throw함 null이 아니면 값을 문자열로 result에 넣음

        num = 3;
        // Java8 이전
        Integer number4 = getNum();
        String result = "";

        try {
            result = number4.toString();
        } catch (NullPointerException e) {
            throw new NoSuchElementException();
        }

        //Optional 사용
        Optional<Integer> number5 = Optional.ofNullable(getNum());
        String result2 = number5.orElseThrow(NoSuchElementException::new)
                .toString();



    }
}
