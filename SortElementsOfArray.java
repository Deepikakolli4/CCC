import java.util.PriorityQueue;

public class SortElementsOfArray {
    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1};
        int results[] = sortElements(nums);
        for (int ele : results) {
            System.out.print(ele + " ");
        }
    }

    public static int[] sortElements(int nums[]) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int sortedElements[] = new int[nums.length];
        for (int num : nums) {
            minHeap.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            sortedElements[i] = minHeap.poll();
        }
        return sortedElements;
    }
}
