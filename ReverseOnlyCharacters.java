public class ReverseOnlyCharacters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String reversed = reverseCharacters(s);
        System.out.println(reversed);
    }

    public static String reverseCharacters(String s) {
        if (s == null || s.length() == 0) return "";

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
