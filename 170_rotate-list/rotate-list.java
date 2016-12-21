/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/rotate-list
@Language: Java
@Datetime: 16-11-25 13:20
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null) {
            return head;
        }
        
        int len = 0;
        ListNode runner = head;
        while (runner != null) {
            runner = runner.next;
            len++;
        }
        
        if (k % len == 0) {
            // no changes needed
            return head;
        }
        
        k %= len;
        
        int offset = len - k - 1;
        runner = head;
        while (offset != 0) {
            runner = runner.next;
            offset--;
        }
        
        ListNode newHead = runner.next;
        runner.next = null;
        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        return newHead;
        
    }
}