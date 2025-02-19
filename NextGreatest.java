import java.util.HashMap;
import java.util.Stack;

public class NextGreatest {
    public static void main(String[] args) {
        int nums1[] = {4, 1, 2};
        int nums2[] = {1, 3, 4, 2};
        int result[] = findNextGreatest(nums1, nums2);
        for (int i : result) System.out.print(i + " ");
    }

    public static int[] findNextGreatest(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> mapNextGreatest = new HashMap<>();
        int result[] = new int[nums1.length];
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                mapNextGreatest.put(stack.pop(), num);
            }
            stack.push(num);
        }
        //finding Next Greatest
        for (int i = 0; i < nums1.length; i++) {
            result[i] = mapNextGreatest.getOrDefault(nums1[i], -1);
        }

        mapNextGreatest.clear();
        stack.clear();
        return result;
    }
}
