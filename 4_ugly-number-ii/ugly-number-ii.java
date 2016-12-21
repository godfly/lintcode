/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/ugly-number-ii
@Language: Java
@Datetime: 16-09-20 03:55
*/

class Solution {
    /**
     * @param n an integer
     * @return the nth prime number as description.
     */
    public int nthUglyNumber(int n) {
        // Write your code here
        if (n <= 0) {
        	return 0;
        } else if (n == 1) {
        	return 1;
        }
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        PriorityQueue<Long> candidate = new PriorityQueue<Long>();
		HashSet<Long> set = new HashSet<Long>();
		set.add(dp[1]);
		for (int i = 2; i <= n; i++) {
			if (!set.contains(dp[i - 1] * 2)) {
				candidate.add(dp[i - 1] * 2);
				set.add(dp[i - 1] * 2);
			}
			if (!set.contains(dp[i - 1] * 3)) {
				candidate.add(dp[i - 1] * 3);
				set.add(dp[i - 1] * 3);
			}
			if (!set.contains(dp[i - 1] * 5)) {
				candidate.add(dp[i - 1] * 5);
				set.add(dp[i - 1] * 5);
			}
			dp[i] = candidate.poll();
		}

		return (int)dp[n];
    }
};
