```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/first-position-of-target
@Language: Markdown
@Datetime: 16-10-24 07:29
```

    public int binarySearch(int[] nums, int target) {
        //write your code here
        int mid= nums.length/2;
        return helper(nums,target,mid);
    }
    
    private int helper(int[] nums, int target,int mid){
        
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target ){
            mid= mid/2;
            helper(nums,target,mid);
        }else{
            mid += mid/2;
            helper(nums,target,mid);
        }
        
        return -1;
    }