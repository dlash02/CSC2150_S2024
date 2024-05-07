package Prep;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class BalancedParenInclass {
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
        // ToDo: Use a deque to decide if the parenthesis are balanced or not
        //
        return true;
    }
}

