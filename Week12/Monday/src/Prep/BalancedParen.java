package Prep;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class BalancedParen {
    public static void main(String[] args) {
        ArrayList<String> expressions = new ArrayList<>();
        expressions.add("(((())))");
        expressions.add("(((())");
        expressions.add("((())))");
        for ( String exp : expressions) {
            if (gotBalanacedParens(exp)) {
                System.out.printf("\n Yes balanaced in %s", exp);
            } else {
                System.out.printf("\n No way no how balanaced:%s", exp);
            }
        }
    }

    private static boolean gotBalanacedParens(String expression) {
        Deque<Character> checker = new LinkedList<>();
        boolean gotLeftParen = false;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                checker.push(c);
            } else if (c == ')') {
                if ( checker.isEmpty() || checker.pop() != '('){
                    return false;
                }
            }
        }
        if ( checker.size() > 0 ) return false;
        else return true;
    }
}

