import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestNumber {
    public static void main(String[] args) {
        String[] nums = {"3","6","7","10"};
        int k = 4;
        String largest = findLargest(nums, k);
        System.out.println(largest);
    }

    public static String findLargest(String nums[], int k) {
        List<BigInteger> Nums = new ArrayList<>();
        for(String n:nums){
            Nums.add(new BigInteger(n));
        }
        Collections.sort(Nums);
        int x = Nums.size()-k;
        return String.valueOf(Nums.get(x));
    }
}
