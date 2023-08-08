package stacks;

import java.util.Stack;

public class Valid_Parentheses{
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        // Between any 2 opening and closing brackets we connot have any 
        // single closing or opening brackets
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else {  
                if(stack.isEmpty())
                    return false;
                if(s.charAt(i) == ')' && stack.peek() == '(')
                    stack.pop();
                else if (s.charAt(i) == ']' && stack.peek() == '[')
                    stack.pop();
                else if (s.charAt(i) == '}' && stack.peek() == '{')
                    stack.pop();
                else 
                    return false;
            }
        }
        return stack.isEmpty() ? true:false;
    }
    public static void main(String[] args) {
        Valid_Parentheses test1 = new Valid_Parentheses();
        String s = "(])";
        System.out.println(test1.isValid(s));
        
    }

}