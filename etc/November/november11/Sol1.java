package etc.November.november11;

import java.util.*;
import java.util.stream.Collectors;

public class Sol1 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int answer = 0;
        List<Integer> priceList =
                Arrays.stream(order)
//                        .map(i -> {
//                                    if (i.contains("latte")) {
//                                        return 5000;
//                                    } else {
//                                        return 4500;
//                                    }
//                                }
//                        )
                        .map(i -> i.contains("latte")? 5000:4500)
                        .collect(Collectors.toList());
//        System.out.println(priceList);
        for (Integer i : priceList) {
            answer += i;
        }
        System.out.println(answer);
    }
}
