class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        char[] X = text1.toCharArray();
        char[] Y = text2.toCharArray();

        int n = X.length;
        int m = Y.length;

        int[][] dp = new int[n + 1][m + 1];

        // for (int i = 0; i < n + 1; i++) {
        //     for (int j = 0; j < m + 1; j++) {
        //         if (i == 0 || j == 0) {
        //             dp[i][j] = 0;
        //         }
        //     }
        // }
        // for(int[] r : dp ){
        //     Arrays.fill(r , -1);
        // }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // return LCS(X, Y, n, m , dp);
        return dp[n][m];

    }

    static int LCS(char[] X, char[] Y, int n, int m, int[][] dp) {

        //base case 
        if (n == 0 || m == 0)
            return 0;

        //choice
        // if (X[n - 1] == Y[m - 1]) {
        //     return 1 + LCS(X, Y, n - 1, m - 1);
        // } else {
        //     return Math.max(LCS(X, Y, n - 1, m), LCS(X, Y, n, m - 1));
        // }

        //check
        if (dp[n][m] != -1)
            return dp[n][m];

        //choice
        if (X[n - 1] == Y[m - 1]) {
            dp[n][m] = 1 + LCS(X, Y, n - 1, m - 1, dp);
        } else {
            dp[n][m] = Math.max(LCS(X, Y, n - 1, m, dp), LCS(X, Y, n, m - 1, dp));
        }

        return dp[n][m];
    }
}