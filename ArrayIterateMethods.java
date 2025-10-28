import java.util.Arrays;

public class ArrayIterateMethods {

    public static void demonstrateLoops(int[] args) {
        int[] numbers = args;
        System.out.print("Array elements using different loops:");
        // Converts an array to a human-readable string.
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

    public static void ArrayMethods() {
        // Default constructor
        int[] numbers = { 5, 10, 25, 15, 20, 55, 30 };
        System.out.println("Original array: " + Arrays.toString(numbers));
        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Finding the index of an element
        int index = Arrays.binarySearch(numbers, 25);
        System.out.println("Index of 25: " + index);

        // Copying the array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // Filling the array with a specific value
        Arrays.fill(copiedArray, 0);
        System.out.println("Filled array: " + Arrays.toString(copiedArray));

        // Comparing two arrays
        boolean areEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are original and copied arrays equal? " + areEqual);

        // Finding the maximum and minimum values
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Calculating the sum of array elements
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of elements: " + sum);

        // Calculating the average of array elements
        double average = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Average of elements: " + average);

        // Reversing the array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));

        // Finding the frequency of an element
        int target = 25;
        long frequency = Arrays.stream(numbers).filter(num -> num == target).count();
        System.out.println("Frequency of " + target + ": " + frequency);

        // Merging two arrays
        int[] anotherArray = { 60, 70, 80 };
        int[] mergedArray = new int[numbers.length + anotherArray.length];
        System.arraycopy(numbers, 0, mergedArray, 0, numbers.length);
        System.arraycopy(anotherArray, 0, mergedArray, numbers.length, anotherArray.length);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        // Finding unique elements
        int[] uniqueElements = Arrays.stream(mergedArray).distinct().toArray();
        System.out.println("Unique elements: " + Arrays.toString(uniqueElements));

        // Shuffling the array
        for (int i = 0; i < mergedArray.length; i++) {
            int randomIndex = (int) (Math.random() * mergedArray.length);
            int temp = mergedArray[i];
            mergedArray[i] = mergedArray[randomIndex];
            mergedArray[randomIndex] = temp;
        }
        System.out.println("Shuffled array: " + Arrays.toString(mergedArray));

        // Finding pairs with a specific sum
        int targetSum = 75;
        System.out.println("Pairs with sum " + targetSum + ":");
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (mergedArray[i] + mergedArray[j] == targetSum) {
                    System.out.println(mergedArray[i] + ", " + mergedArray[j]);
                }
            }
        }

        // Finding the second largest element
        int[] findSecondLargest = { 5, 10, 25, 15, 20, 55, 30 };
        Arrays.sort(findSecondLargest);
        System.out.println("Finding the second largest element: " + findSecondLargest[findSecondLargest.length - 2]);
        // Finding the second smallest element
        System.out.println("Finding the second smallest element: " + findSecondLargest[1]);

        // Finding duplicates in the array
        System.out.println("Finding duplicates in the array:");
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {
                if (mergedArray[i] == mergedArray[j]) {
                    System.out.println(mergedArray[i]);
                }
            }
        }

        // Finding the first non-repeated element
        System.out.println("First non-repeated element:");
        for (int i = 0; i < mergedArray.length; i++) {
            int count = 0;
            for (int j = 0; j < mergedArray.length; j++) {
                if (mergedArray[i] == mergedArray[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(mergedArray[i]);
                break;
            }
        }

    }

    public static void main(String[] args) {
        demonstrateLoops(new int[] { 5, 10, 25, 15, 20, 55, 30 });
        ArrayMethods();
    }
}
