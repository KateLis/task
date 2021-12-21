package hometasknovember;

import java.util.*;
public class BalancedBrackets {
    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
       Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue; //переход на сл эл-т в строке
            }


            if (stack.isEmpty())
                return false;
            char check; //это просто название переменной, спокойно
            switch (x) {
                case ')':
                    check = stack.pop(); //возвращает с удалением элемент из начала очереди
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args)
    {
        String expr = ")[{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
