package hanbitMedia.ch05;

import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        //스택 선언
        Stack<Integer> stack = new Stack<>();

        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.pop();
        stack.push(1);
        stack.push(4);
        stack.pop();

        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
