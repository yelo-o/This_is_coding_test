package etc.November.november15;

import java.util.*;

public class Sol1 {
    public static void main(String[] args) {
        //TODO 길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
        // 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다.
        // 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        int answer = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i : A) {
            listA.add(i);
        }
        for (int i : B) {
            listB.add(i);
        }
        Collections.sort(listA);
        listA.sort(Comparator.naturalOrder()); //오름차순
        listB.sort((x, y) -> y - x); //내림차순
        for (int i = 0; i < listA.size(); i++) {
            answer += listA.get(i) * listB.get(i);
        }
        System.out.println(answer);



//        Integer[] sortedA = Arrays.stream(A)
//                .boxed()
//                .parallel()
//                .sorted()
//                .toArray(Integer[]::new);
//
//        Integer[] sortedB = Arrays.stream(B)
//                .boxed()
//                .parallel()
//                .sorted((a, b) -> b - a)
//                .toArray(Integer[]::new);
//
//        for (int i = 0; i < sortedA.length; i++) {
//            answer += sortedA[i] * sortedB[i];
//        }
//        System.out.println(answer);


    }
}
