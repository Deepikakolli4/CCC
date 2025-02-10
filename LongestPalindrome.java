import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "a";
        long length = findLengthOfLongestPalindrome(s);
        System.out.println(length);
    }

    public static long findLengthOfLongestPalindrome(String s) {
        long length = 0;
        HashMap<Character, Integer> mapp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapp.put(s.charAt(i), mapp.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean isOdd = false;
        for (int count : mapp.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                isOdd = true;
            }
        }
        return isOdd ? length + 1 : length;
    }
}
