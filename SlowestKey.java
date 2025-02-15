public class SlowestKey {
    public static void main(String[] args) {
        int[] releaseTime = {12,23,36,46,62};
        String keysPressed = "spuda";
        char ch = findKeyWithLongestDuration(releaseTime, keysPressed);
        System.out.println(ch);
    }

    public static char findKeyWithLongestDuration(int[] releaseTime, String keysPressed) {
        int maxDuration = Integer.MIN_VALUE;
        char slowestKey = keysPressed.charAt(0);
        for (int i = 1; i < releaseTime.length; i++) {
            int duration = releaseTime[i] - releaseTime[i - 1];
            if (duration > maxDuration || duration == maxDuration && keysPressed.charAt(i)>slowestKey) {
                maxDuration = duration;
                slowestKey = keysPressed.charAt(i);
            }
        }
        return slowestKey;
    }
}
