import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheLargestAlmostMissingInteger {
    public static void main(String[] args) {
        int arr[] = {3, 7, 2, 1, 7};
        int subArraySize = 3;
        int result = largestInteger(arr, subArraySize);
        System.out.println(result);
    }

    public static int largestInteger(int nums[], int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++)
        {
            Set<Integer> uniqueInSubarray = new HashSet<>();

            for (int h = i; h < i + k; h++)
            {
                uniqueInSubarray.add(nums[h]);
            }

            for (int num : uniqueInSubarray)
            {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }


        int result = -1;
        for (int num : countMap.keySet())
        {
            if (countMap.get(num) == 1)
            {
                result = Math.max(result, num);
            }
        }

        return result;
    }
}
