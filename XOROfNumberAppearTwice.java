import java.util.HashMap;

public class XOROfNumberAppearTwice {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        int result = findXOR(nums);
        System.out.println(result);
    }

    public static int findXOR(int[] nums) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : mapp.keySet()) {
            if (mapp.get(key) == 2) {
                result ^= key;
            }

        }
        return result;
    }
}
