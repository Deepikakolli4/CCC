import java.util.PriorityQueue;

public class KthSmallestInSortedArray {
    public static void main(String[] args) {
        int[][] nums = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        int result = findKthSmallest(nums, k);
        System.out.println(result);
    }

    public static int findKthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int row[] : matrix) {
            for (int num : row) {
                heap.add(num);
            }
        }
        while (k-- > 1) {
            heap.poll();
        }
        return heap.peek();
    }
}
