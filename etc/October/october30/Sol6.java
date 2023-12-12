package etc.October.october30;

public class Sol6 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        int answer = 0;
        String[] split = binomial.split(" ");
        if (binomial.contains("+")) {
            System.out.println("split[0] : "+ split[0]);
            System.out.println("split[1] : "+ split[1]);
            System.out.println("split[2] : "+ split[2]);
            answer = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
        } else if (binomial.contains("-")) {
            answer = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
        } else {
            answer = Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
        }

        System.out.println(answer);

    }
}
