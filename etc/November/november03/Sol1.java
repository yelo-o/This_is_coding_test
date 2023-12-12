package etc.November.november03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sol1 {
    public static void main(String[] args) {
        // 문자열 myString과 pat가 주어집니다.
        // myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
        String myString = "AAAAaaaa", pat = "a";
        String answer = "";
        List<String> lst = new ArrayList<>();

        String ans = IntStream.range(0, myString.length()) //배열 0 ~ 끝까지
                .mapToObj(idx -> myString.substring(0, idx + 1))
                .filter(sub -> sub.endsWith(pat))
                .reduce("", (acc, curr) -> curr);

        System.out.println(ans);

        //IntStream 생성
        IntStream range = IntStream.range(0, myString.length());
        //IntStream -> Stream<String>
        Stream<String> stringStream = range.mapToObj(idx -> myString.substring(0, idx + 1));
        //필터링
        Stream<String> filteredStringStream = stringStream.filter(sub -> sub.endsWith(pat));

        answer = filteredStringStream.reduce("", (acc, curr) -> curr);

//        System.out.println(ans);

    }
}
