/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/two-sum
@Language: Java
@Datetime: 16-11-08 09:07
*/

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        
        if(numbers ==null || numbers.length ==0){
            return new int[]{0,0};
        }
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int index1 = 0, index2 = 0;
        for(int i=0;i<numbers.length;i++){
            if(hashmap.containsKey(target - numbers[i])){
                index1 = hashmap.get(target - numbers[i]);
                index2 = i;
                return new int[]{1+index1,1+index2};
            }else{
                hashmap.put(numbers[i],i);
            }
        }
        return new int[]{0,0};
    }
}