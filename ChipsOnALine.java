import java.util.Scanner;

public class ChipsOnALine {

    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input values
        int n = sc.nextInt(); // Number of chips
        int x = sc.nextInt(); // Number of points
        int m = sc.nextInt(); // Target remaining chips

        // dp[i][j] represents the number of ways to place j chips in i points
        long[][] dp = new long[x + 1][n + 1];

        // Base case: 1 way to place 0 chips in 0 points
        dp[0][0] = 1;

        // Fill the DP table
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= n; j++) {
                // Case where we place 0 chips at the current point
                dp[i][j] = dp[i - 1][j];

                // Case where we place 1 chip at the current point
                if (j >= 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                }

                // Case where we place 2 chips at the current point
                if (j >= 2) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 2]) % MOD;
                }
            }
        }

        // The answer is the number of ways to place exactly m chips in x points
        System.out.println(dp[x][m]);

        sc.close();
    }
}
