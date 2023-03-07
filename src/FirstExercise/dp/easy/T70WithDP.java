package FirstExercise.dp.easy;

public class T70WithDP {
    public int climbStairs(int n) {

        //背包求排列问题
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2; j++) {
                if (i >= j) {
                    dp[i] += dp[i - j];
                }
            }
        }
        return dp[n];
    }
}
