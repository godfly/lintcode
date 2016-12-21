/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/copy-list-with-random-pointer
@Language: Java
@Datetime: 16-11-25 13:35
*/

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode runner = head;
        
        while (runner != null) {
            RandomListNode copy = new RandomListNode(runner.label);
            map.put(runner, copy);
            runner = runner.next;
        }
        
        runner = head;
        
        while (runner != null) {
            if (runner.next != null) {
                map.get(runner).next = map.get(runner.next);
            }
            if (runner.random != null) {
                map.get(runner).random = map.get(runner.random);
            }
            
            runner = runner.next;
        }
        
        return map.get(head);
    }
}