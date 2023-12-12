package etc.October.october27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol4 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
//        int[] answer = {};
//        String x = "x";
        String[] split = myString.split("x"); //[1, 2, 1, 0, 1, 0]
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println(split.length); //5
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<split.length; i++) {
            list.add(split[i].length());
        }
        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add(0);
        }
        System.out.println(list);
        Integer[] array = list.toArray(new Integer[0]);
        int[] answer = Arrays.stream(array).mapToInt(Integer::intValue).toArray();

    }

}
