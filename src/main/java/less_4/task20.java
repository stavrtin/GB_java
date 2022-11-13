package less_4;

import java.util.Stack;

public class task20 {
    public static void main(String[] args) {
        System.out.println("Задача 20");
        String s = "(([])){}";
        System.out.println(s);
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // ---- сложим строку в стек -------
        for (int i = 0; i < s.length(); i++){
            // ---- если открывающая - закидываем на стек -----
            if (s.charAt(i) == '(' || s.charAt(i) == '[' ||s.charAt(i) == '{' ){
                stack.add(s.charAt(i));
            }
            // ---- если стек пустой - сразу FALSE, тк значит, что пришла закрывающая, а открывающей в стеке нет--
            else if (stack.isEmpty()) {
                return false;

            } else // ---- если не открывающаяся - читаем из стека ----

                switch (s.charAt(i)){
                    case (')'): {
                        if (stack.peek() != '(') return false;
                        stack.pop();
                        break;
                    }
                    case (']'): {
                        if (stack.peek() != '[') return false;
                        stack.pop();
                        break;
                    }
                    case ('}'): {
                        if (stack.peek() != '{') return false;
                        stack.pop();
                        break;
                    }
                    default: stack.pop();
                }

        }

        if (!stack.isEmpty()) return false;
        return true;

    }

}



