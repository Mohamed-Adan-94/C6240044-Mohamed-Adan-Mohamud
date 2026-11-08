
package ArrayStackAssignment;

public class Main {

    public static void main(String[] args) {

        // Original array
        int[] numbers = {10, 20, 30, 40, 50};

        // Reverse the complete array
        int[] result = Solution.reverseArray(numbers);

        // Display original array
        System.out.println("Original Array:");

        for (int num : numbers) {

            System.out.print(num + " ");
        }

        // Display reversed array
        System.out.println("\n\nReversed Array:");

        for (int num : result) {

            System.out.print(num + " ");
        }


        // BONUS: Reverse first 3 elements
        int[] bonusNumbers = {10, 20, 30, 40, 50};

        int[] bonusResult =
                Solution.reverseFirstK(bonusNumbers, 3);

        System.out.println("\n\nBonus: Reverse First 3 Elements:");

        for (int num : bonusResult) {

            System.out.print(num + " ");
        }

        System.out.println();
    }
}
