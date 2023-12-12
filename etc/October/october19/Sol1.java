package etc.October.october19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        for(String s : arr) {
            System.out.println(s);
        }
        String my_string = "bus";
        String answer = "";


        for(int i=0; i<my_string.length(); i++) {
            if (!arr.contains(Character.toString(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        System.out.println("답은 "+ answer);


    }

}
