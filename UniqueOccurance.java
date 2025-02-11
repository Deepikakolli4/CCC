import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurance {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 1, 1, 3};
        boolean hasUniqueOccurrences = verifyUniqueOccurrences(nums);
        System.out.println(hasUniqueOccurrences);
    }

    public static boolean verifyUniqueOccurrences(int nums[]) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        HashSet<Integer> uniqueOccurrences = new HashSet<>();
        for (int num : nums) {
            mapp.put(num, mapp.getOrDefault(num, 0) + 1);
        }
        for (int freq : mapp.values()) {
            if (uniqueOccurrences.contains(freq)) {
                return false;
            }
            uniqueOccurrences.add(freq);
        }
        return true;
    }
}
