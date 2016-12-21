```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/subarray-sum
@Language: Markdown
@Datetime: 16-11-08 01:19
```

暴力遍历
public class Solution {
    public ArrayList<Integer> subarraySum(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(nums == null || nums.length ==0){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            int count = nums[i];
            if(nums[i] == 0){
                result.add(i);
                result.add(i);
                break;
            }
            for(int j=i+1;j<nums.length;j++){
                count += nums[j];
                if(count == 0){
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return result;
    }
}