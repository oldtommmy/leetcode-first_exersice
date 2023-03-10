package FirstExercise.dp.easy;

public class T1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {

        //题目即求最长不不连续公共子序列
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] dp = new int[len1 + 1][len2 + 1];
        //dp[i][j]指的是nums1[i - 1] nums2[j - 1]结尾的最长不连续公共子序列长度

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
