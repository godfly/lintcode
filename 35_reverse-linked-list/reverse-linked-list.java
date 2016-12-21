/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/reverse-linked-list
@Language: Java
@Datetime: 16-10-27 12:28
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null){
            return null;
        }
        
        ListNode pos = head;
        ListNode next = null;
        ListNode pre = null;
        
        while(pos!=null){
            next = pos.next;
            pos.next =pre;
            pre = pos;
            pos = next;
        }
        return pre;
    }
}
