import java.util.*;

public class CalculateMad{

    // Function to calculate the MAD (Maximum Appearing Duplicate)
    public static int calculateMad(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxDuplicate = 0;

        // Count frequency of each number and find the max number that appears at least twice
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) >= 2) {
                maxDuplicate = Math.max(maxDuplicate, num);
            }
        }

        return maxDuplicate;
    }

    // Main function to solve the problem
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // number of test cases
        System.out.println("Total test cases: " + t);

        // Iterate over each test case
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();  // size of array
            int[] arr = new int[n];

            // Read the array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int totalSum = 0;

            while (true) {
                // Calculate the sum of the current array and add it to totalSum
                int currentSum = Arrays.stream(arr).sum();  // Sum of the array
                totalSum += currentSum;

                // Calculate MAD for the current array
                int mad = calculateMad(arr);

                // If MAD is 0, the process ends because all elements will be zero

                if (mad == 0) {
                    break;
                }

                // Update the array: set each element to MAD
                Arrays.fill(arr, mad);
                System.out.println("Updated array: " + Arrays.toString(arr));

                // Check if the array has become homogeneous (all values the same)
                boolean isHomogeneous = true;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != arr[0]) {
                        isHomogeneous = false;
                        break;
                    }
                }

                if (isHomogeneous) {
                    break;
                }
            }

            // Output the result for this test case
            System.out.println(totalSum);
        }

        scanner.close();
    }

    // Entry point for the program
    public static void main(String[] args) {
        solve();
    }
}
