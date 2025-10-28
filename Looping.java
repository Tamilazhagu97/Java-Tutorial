import java.util.Arrays;

public class Looping {

    public static void demonstrateLoops() {
        int[] numbers = { 5, 10, 15, 20, 25 };
        System.out.print("Array elements using different loops:");
        System.err.println(Arrays.toString(numbers));

        // Using for-each loop
        System.out.println("For-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        System.out.println("Enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // While loop
        System.out.println("While loop:");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // Do-while loop
        System.out.println("Do-while loop:");
        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);

        // Looping through the array in reverse order
        System.out.println("Reverse order:");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.println(numbers[j]);
        }

        // Skipping elements (even indices)
        System.out.println("Even indices:");
        for (int j = 0; j < numbers.length; j += 2) {
            System.out.println(numbers[j]);
        }

        // Using continue statement
        System.out.println("Using continue (skip 15):");
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 15) {
                continue;
            }
            System.out.println(numbers[j]);
        }

        // Using break statement
        System.out.println("Using break (stop at 15):");
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 15) {
                break;
            }
            System.out.println(numbers[j]);
        }

    }
}
