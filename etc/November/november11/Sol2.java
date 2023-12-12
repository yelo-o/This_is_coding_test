package etc.November.november11;

import java.util.ArrayList;
import java.util.List;

public class Sol2 {
    public static void main(String[] args) {
        // 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다.
        // 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때,
        // 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
        String[] picture = {"x.x", ".x.", "x.x"};
        int k = 3;
        String[] answer = {};
        answer = new String[picture.length * k]; //size of answer array is always three times bigger than picture array
        int len = answer.length; //9
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String tmp = "";
            for (int j = 0; j < picture[0].length(); j++) {
                for (int c = 0; c < k; c++) { //각 글자를 3번 반복
                    tmp += picture[i].charAt(j);
                }
            }
            list.add(tmp);
        }
//        System.out.println(list);
        for (int i = 0; i < len; i++) {
            answer[i] = list.get(i/k);
        }


        }
}


