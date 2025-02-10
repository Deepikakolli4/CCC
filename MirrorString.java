import java.util.HashMap;

public class MirrorString {
    public static void main(String[] args) {
        String input = "aczzx";
        long result = calculateScore(input);
        System.out.println(result);
    }

    public static long calculateScore(String input) {
        HashMap<Character, Integer> mapp = new HashMap<>();
        long score = 0;
        for (int i = 0; i < input.length(); i++) {
            char original = input.charAt(i);
            char image = (char) ('z' - (original - 'a'));
            if (mapp.containsKey(image)) {
                int j = mapp.get(image);
                score += (i - j);
                mapp.remove(image);
            } else {
                mapp.put(original, i);
            }
        }
        return score;
    }
}
