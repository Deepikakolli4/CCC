public class SameDigits {
    public static void main(String[] args) {
        String s = "3902";
        boolean areSame = hasSameDigits(s);
        System.out.println(areSame);
    }

    public static boolean hasSameDigits(String s) {
        while (s.length() > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = ((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10;
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s.chars().distinct().count() == 1;
    }
}
