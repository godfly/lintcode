/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/3sum
@Language: Java
@Datetime: 16-11-08 09:14
*/

public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
		if(numbers == null || numbers.length < 3) {
			return rst;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 2; i++) {
			if (i != 0 && numbers[i] == numbers[i - 1]) {
				continue; // to skip duplicate numbers; e.g [0,0,0,0]
			}

			int left = i + 1;
			int right = numbers.length - 1;
			while (left < right) {
				int sum = numbers[left] + numbers[right] + numbers[i];
				if (sum == 0) {
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(numbers[i]);
					tmp.add(numbers[left]);
					tmp.add(numbers[right]);
					rst.add(tmp);
					left++;
					right--;
					while (left < right && numbers[left] == numbers[left - 1]) { // to skip duplicates
						left++;
					}
					while (left < right && numbers[right] == numbers[right + 1]) { // to skip duplicates
						right--;
					}
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return rst;
    }
}