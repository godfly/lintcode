```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/subsets
@Language: Markdown
@Datetime: 16-10-14 14:07
```

class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    private ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        
        if (nums == null || nums.length == 0) {
            return list;
        }
   
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            for(int j=i;j<nums.length;j++){
                arrList.add(nums[j]);
                list.add(arrList);
            }
        }
        
        return list;
    }
}