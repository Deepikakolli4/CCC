public class StringReformat {
    public static void main(String[] args) {
        String s = "a0b1c2";
        String output = reformat(s);
        System.out.println(output);
    }

    public static String reformat(String s) {
        StringBuilder characters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                characters.append(ch);
            }
        }
        if (characters.length() == digits.length()) {
            for (int i = 0; i < characters.length(); i++) {
                result.append(digits.charAt(i)).append(characters.charAt(i));
            }
        } else if (characters.length() + 1 == digits.length()) {
            for (int i = 0; i < characters.length(); i++) {
                result.append(digits.charAt(i)).append(characters.charAt(i));
            }
            result.append(digits.charAt(digits.length() - 1));
        } else if (digits.length() + 1 == characters.length()) {
            for (int i = 0; i < digits.length(); i++) {
                result.append(characters.charAt(i)).append(digits.charAt(i));
            }
            result.append(characters.charAt(characters.length() - 1));
        }else{
            return " ";
        }
        return result.toString();
    }
}
