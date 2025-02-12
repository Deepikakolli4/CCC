import java.util.HashMap;

public class MaximumFrequency {
    public static void main(String[] args) {
        String s = "aaaaabbc";
        int result = findMaximumDifferenceInFrequency(s);
        System.out.println(result);
    }

    public static int findMaximumDifferenceInFrequency(String s) {
        char[] letters = s.toCharArray();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : letters) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int oddCount = Integer.MIN_VALUE;
        int evenCount = Integer.MAX_VALUE;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount = Math.max(oddCount, count);
            } else {
                evenCount = Math.min(evenCount, count);
            }
        }
        return oddCount - evenCount;
    }
}
