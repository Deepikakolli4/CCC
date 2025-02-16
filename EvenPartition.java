public class EvenPartition {
    public static void main(String[] args) {
        int nums[] = {10, 10, 3, 7, 6};
        int partitions = findNoOfPartitions(nums);
        System.out.println(partitions);
    }

    public static int findNoOfPartitions(int nums[]) {
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum = totalSum - leftSum;
            if (rightSum % 2 == leftSum % 2) {
                count++;
            }
        }
        return count;
    }
}
