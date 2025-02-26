import java.util.HashSet;
import java.util.Set;

public class BitManipulation {
    public static void main(String[] args) {
        int num = 7;
        int arr[] = {1, 1, 2};
        printBinary(num);
        int result = noOfOnes(num);
        System.out.println();
        System.out.println(result);
        int noOfChanges = noOfBitsDiffer(4, 2);
        System.out.println(noOfChanges);
        int res = bitwiseORSubArray(arr);
        System.out.println(res);
    }

    public static void printBinary(int num) {
        for (int i = 3; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
    }

    public static int noOfOnes(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static int noOfBitsDiffer(int n, int k) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            int bitN = (n >> i) & 1;
            int bitK = (k >> i) & 1;

            if (bitN == 0 && bitK == 1) return -1;
            else if (bitN == 1 && bitK == 0) count++;
        }
        return count;
    }

    public static int bitwiseORSubArray(int[] arr) {
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> currentSet = new HashSet<>();

        for (int num : arr) {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(num);

            for (int prev : currentSet) {
                newSet.add(prev | num);
            }

            currentSet = newSet;
            resultSet.addAll(currentSet);
        }

        return resultSet.size();
    }

    public static int countPrime(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int result = noOfOnes(i);
            boolean isPrime = checkIsPrime(result);
            if (isPrime) count++;
        }
        return count;
    }
     public  static  boolean checkIsPrime ( int num ){
         if (num < 2) return false;
         for (int i = 2; i <= num / 2; i++) {
             if (num % i == 0) return false;
         }
         return true;
     }
}
