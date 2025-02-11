import java.util.HashMap;

public class AlmostEqualStrings {
    public static void main(String[] args) {
        String word1 = "aaaa", word2 = "bccb";
        boolean AreEqual = checkWords(word1, word2);
        System.out.println(AreEqual);
    }

    public static boolean checkWords(String word1, String word2) {
        HashMap<Character, Integer> mapp = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            mapp.put(word1.charAt(i), mapp.getOrDefault(word1.charAt(i), 0) + 1);
            mapp.put(word2.charAt(i), mapp.getOrDefault(word2.charAt(i), 0) - 1);
        }
        for (int diff : mapp.values()) {
            if (diff > 3 || diff < -3) {
                return false;
            }
        }
        return true;
    }
}
