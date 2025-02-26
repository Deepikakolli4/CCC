public class SpecialString {
    public static void main(String[] args) {
        String s = "aaabaaa";
        int k = 3;
        boolean flag = false;
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                if (count == k) {
                    flag = true;
                    break;
                }
                count = 1;
            }
        }

        if (count == k) flag = true;

        System.out.println(flag);
    }
}
