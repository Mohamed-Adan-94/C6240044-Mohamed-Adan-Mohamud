
package ArrayStackAssignment;

public class Solution {

    // Reverse the complete array
    public static int[] reverseArray(int[] numbers) {

        // 1. Create ArrayStack with initial capacity 2
        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // 2. Push all numbers onto the stack
        for (int i = 0; i < numbers.length; i++) {

            stack.push(numbers[i]);
        }

        // 3. Create a new array
        int[] reversed = new int[numbers.length];

        // 4. Pop elements into the new array
        for (int i = 0; !stack.isEmpty(); i++) {

            reversed[i] = stack.pop();
        }

        // 5. Return the reversed array
        return reversed;
    }


    // BONUS: Reverse only the first K elements
    public static int[] reverseFirstK(int[] numbers, int k) {

        if (k < 0 || k > numbers.length) {

            throw new IllegalArgumentException("Invalid K value");
        }

        // Create stack with initial capacity 2
        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // Push the first K elements
        for (int i = 0; i < k; i++) {

            stack.push(numbers[i]);
        }

        // Pop into the first K positions
        for (int i = 0; i < k; i++) {

            numbers[i] = stack.pop();
        }

        return numbers;
    }
}
