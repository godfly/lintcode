/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/reorder-list
@Language: Java
@Datetime: 16-11-25 13:46
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
     * @return: void
     */
    public void reorderList(ListNode head) {  
        // write your code here
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
       
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode secondHalf = slow.next;
        slow.next = null;
        
        ListNode pre = null;
        ListNode cur = secondHalf;
        
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        
        ListNode tailRunner = pre;
        ListNode headRunner = head;

        while (headRunner != null || tailRunner != null) {
            ListNode nextHead = headRunner.next;
            headRunner.next = tailRunner;
            headRunner = nextHead;
            if (tailRunner != null) {
                ListNode nextTail = tailRunner.next;
                tailRunner.next = headRunner;
                tailRunner = nextTail;
            }
        }
    }
}
