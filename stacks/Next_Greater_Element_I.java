package stacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_I {
    public int[] nextGreaterElements(int[] array) {
        int[] ansArray = new int[array.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = array.length - 1; i >= 0; i--) {
            // If the stack is empty
            if (stack.isEmpty()) {
                stack.push(array[i]);
                ansArray[i] = -1;
            }

            // If the top element of the stack is greater than the current element
            else if (stack.peek() > array[i]) {
                ansArray[i] = stack.peek();
                stack.push(array[i]);
            }

            else {
                while (!stack.isEmpty() && stack.peek() <= array[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ansArray[i] = -1;
                else
                    ansArray[i] = stack.peek();

                stack.push(array[i]);
            }
        }
        return ansArray;
    }

    public static void main(String[] args) {
        Next_Greater_Element_I test1 = new Next_Greater_Element_I();
        int[] array = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        System.out.println(Arrays.toString(test1.nextGreaterElements(array)));

    }

}