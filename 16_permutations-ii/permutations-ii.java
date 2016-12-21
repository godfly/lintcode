/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/permutations-ii
@Language: Java
@Datetime: 16-10-14 08:58
*/

class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
     
    private ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
      
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Write your code here
               
        helper(nums,0,nums.length);
        
        return list;
    }
    
    public void helper(int nums[],int left,int right){
        if(left == right){
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            for(int i=0;i<right;i++){
                arrList.add(nums[i]);
            }
            list.add(arrList);
        }else{
            for(int j=left;j<right;j++){
                if(isValid(nums,left,j)){
                    swap(nums,j,left);
                    helper(nums,left+1,right);
                    swap(nums,j,left);
                        
                }
            }
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int m = nums[i];
        nums[i] = nums[j];
        nums[j] = m;
    }
    
    public boolean isValid(int nums[],int left,int index){
        for(int m=left;m<index;m++){
            if(nums[m] == nums[index])
                return false;
            else
                continue;
        }
        return true;
    }
}


