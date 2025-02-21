public class ReverseString {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String result = findStringReverse(s,k);
        System.out.println(result);
    }
    public static String findStringReverse(String s,int k){
        StringBuilder res = new StringBuilder();
        return res.append(s.substring(0,k)).reverse().append(s.substring(k)).toString();
    }
}
