```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/kth-largest-element
@Language: Markdown
@Datetime: 16-09-23 08:56
```

    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        quickSort(nums);
        return nums[nums.length-k];
    }
    
    private void quickSort(int[] nums){
        if(nums.length > 0){
            sort( nums , 0 ,nums.length-1 );
        }
    }
    
    private void sort(int[] nums,int left,int right){
        if( left < right ){
            int dp = dp(nums,left,right);
            sort(nums,left,dp-1);
            sort(nums,dp+1,right);
        }
    }
    
    private int dp(int[] nums,int left,int right){
        int tmp = nums[left];
        if(left < right){
            while(left < right && tmp <= nums[right]){
                right--;
            }
            nums[left] = nums[right];
            
            while(left < right && tmp >= nums[left]){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = tmp;
        return left;
    }

Running time error

使用快排的一部分即可