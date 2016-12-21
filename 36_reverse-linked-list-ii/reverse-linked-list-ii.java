/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/reverse-linked-list-ii
@Language: Java
@Datetime: 16-10-29 07:09
*/

/**
 * Definition for ListNode
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
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
                if (head == null || head.next == null) {
            return head;
        }
        
        if (m >= n) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        
        //1. get the pre node before m.
        for (int i = m; i > 1; i--) {
            pre = pre.next;
        }
        
        // record the tail of the reversed link.
        ListNode reverseTail = pre.next;
        pre.next = null;
        
        // reverse the link.
        ListNode cur = reverseTail;
        
        for (int i = n - m + 1; i > 0; i--) {
            if (i == 1) {
                // 这里是翻转段后的第一个元素 .
                reverseTail.next = cur.next;
            }
            
            ListNode tmp = cur.next;
            
            cur.next = pre.next;
            pre.next = cur;
            
            cur = tmp;
        }
        
        return dummy.next;
    }
}