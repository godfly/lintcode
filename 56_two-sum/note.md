```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/two-sum
@Language: Markdown
@Datetime: 16-11-08 09:07
```

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] result = new int[2];
        if(numbers ==null || numbers.length <=1){
            return result;
        }
        HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
        for(int i=0;i<numbers.length;i++){
            int num = numbers[i];
            int[] value = map.get(num);
            if(value == null){
                value = new int[]{i};
                map.put(target - num,value);
            }else{
                result[0] = value[0] + 1;
                result[1] = i + 1;
            }
        }
        return result;
    }
}