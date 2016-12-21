/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/insert-interval
@Language: Java
@Datetime: 16-10-25 12:04
*/

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        if(null == intervals || intervals.size() == 0) {
            result.add(newInterval);
            return result;
        }
        for(int i=0;i<intervals.size();i++){
            if(newInterval.end < intervals.get(i).start){
                result.add(newInterval);
                for(int j=i;j<intervals.size();j++){
                    result.add(intervals.get(j));
                }
                break;
            }else if(newInterval.start > intervals.get(i).end){
                result.add(intervals.get(i));
            }else{
                newInterval.start = Math.min(newInterval.start,intervals.get(i).start);
                newInterval.end = Math.max(newInterval.end,intervals.get(i).end);
            }
            if(i == intervals.size() - 1){
                result.add(newInterval);
            }
        }
        return result;
    }
}