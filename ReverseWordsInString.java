public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder reverseWords = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                reverseWords.append(s.charAt(i));
            } else {
                result.append(reverseWords.reverse());
                result.append(' ');
                reverseWords.delete(0, reverseWords.length());
            }
        }
        result.append(reverseWords.reverse());
        return result.toString();
    }
}
