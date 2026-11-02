class Solution {
    public int fib(int n) {


        return fibo(n);

        // int[] dp = new int[n + 1];
        // return memo(n, dp);

    }


    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return fibo(n-1)+fibo(n-2);
    }

    // public int memo(int n, int dp[]) {
    //     if (n == 0)
    //         return 0;
    //     if (n == 1)
    //         return 1;

    //     if (dp[n] != 0)
    //         return dp[n];

    //     dp[n]= memo(n - 1, dp) + memo(n - 2, dp);

    //     return dp[n];
    // }

}