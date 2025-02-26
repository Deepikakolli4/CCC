import java.util.HashMap;

public class CountElementsWithMaxFrequency {
    public static void main(String[] args) {
        int result = 0;
        int arr[] = {1, 2, 3, 4, 5};
        int maxFreq = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int freq = map.getOrDefault(i, 0) + 1;
            map.put(i, freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        System.out.println(maxFreq);

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                result += freq;
            }
        }
        System.out.println(result);
    }
}
