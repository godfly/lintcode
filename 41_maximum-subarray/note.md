```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/maximum-subarray
@Language: Markdown
@Datetime: 16-12-17 14:00
```

// Version 2: Prefix Sum

public class Solution {
    public int maxSubArray(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        
        int max = Integer.MIN_VALUE, sum = 0, minSum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum - minSum);
            minSum = Math.min(minSum, sum);
        }

        return max;
    }
}



public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        if(nums.size()==0)  
            return 0;  
        int n = nums.size();
        int []global = new int[n];
        int []local = new int[n];
        global[0] = nums.get(0);
        local[0] = nums.get(0);
        for(int i=1;i<n;i++)  
        {  
            local[i] = Math.max(nums.get(i),local[i-1]+nums.get(i));  
            global[i] = Math.max(local[i],global[i-1]);  
        }  
        return global[n-1];  
    }
}
