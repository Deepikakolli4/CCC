import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int num1[] = {1, 2, 2, 1};
        int num2[] = {2, 2};
        int[] intersection = findPoints(num1, num2);
        for (int i : intersection) System.out.print(i + " ");
    }

    public static int[] findPoints(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (freqMap.getOrDefault(num, 0) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
