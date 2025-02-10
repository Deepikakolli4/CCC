public class DetectCaptial {
    public static void main(String[] args) {
        String s = "FlAG";
        boolean result = detectCapitalUse(s);
        System.out.println(result);
    }
    public static boolean detectCapitalUse(String s) {
        return (s.equals(s.toUpperCase())||s.equals(s.toLowerCase())||s.equals(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()));

    }
}
