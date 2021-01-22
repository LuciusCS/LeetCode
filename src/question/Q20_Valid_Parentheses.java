package question;

import java.util.Stack;

public class Q20_Valid_Parentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }

        int index = s.length();
        for1:
        for (int i = 0; i < index; i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                switch (s.charAt(i)) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(s.charAt(i));
                        break;
                    case ')':
                        if (!stack.peek().equals('(')) {
                            break for1;
                        }else {
                            stack.pop();
                        }
                        break;
                    case ']':
                        if (!stack.peek().equals('[')) {
                            break for1;
                        }else {
                            stack.pop();
                        }
                        break;
                    case '}':
                        if (!stack.peek().equals('{')) {
                            break for1;
                        }else {
                            stack.pop();
                        }
                        break;
                }

            }
        }
        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    ;


    public static void main(String[] args) {

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));

    }


}
