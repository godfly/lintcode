/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/flatten-list
@Language: Java
@Datetime: 16-10-23 13:38
*/

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
         List<Integer> result = new ArrayList<Integer>();
         helper(nestedList,result);
         return result;
    }
    
    private void helper(List<NestedInteger> nestedList,List<Integer> result){
        if(nestedList != null){
            for(NestedInteger nList:nestedList){
                if(nList.isInteger()){
                    result.add(nList.getInteger());
                }else{
                    helper(nList.getList(),result);
                }
            }
        }
    }
}