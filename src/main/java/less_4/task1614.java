package less_4;

import java.util.Stack;

public class task1614 {
    public static void main(String[] args) {
        System.out.println("Задача 1614 макс глубина скобок ");
        String s = "(1+(2*3)+((8)/4))+1";
//        String s = "()";
        System.out.println(maxDepth(s));

    }

    public static int maxDepth(String s) {
        Stack stack = new Stack<>();
        // ---- загоним посимвольно строку в стек (если символ = скобке открытой)---
        int maxDep = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                depth = stack.size();
                if (maxDep <= depth) {
                    maxDep = depth;
                }
            }
            else if (s.charAt(i) == ')') {
                stack.pop();
            }
            else {
                depth = stack.size();
                if (maxDep <= depth){
                    maxDep = depth;
                }
            }
        }
//        System.out.println(stack);
    return maxDep;
    }

}
