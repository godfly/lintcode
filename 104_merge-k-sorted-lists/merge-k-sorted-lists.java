/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/merge-k-sorted-lists
@Language: Java
@Datetime: 16-12-19 13:48
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
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if(lists == null || lists.size() == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue(lists.size(), new Comparator<ListNode>(){
            public int compare(ListNode node1, ListNode node2){
                return node1.val - node2.val;
            }
        });

        for(ListNode node : lists){
            if(node != null){
                queue.add(node);
            }
        }

        ListNode dummy = new ListNode(1);
        ListNode runner = dummy;

        while(!queue.isEmpty()){
            ListNode current = queue.poll();
            runner.next = current;
            runner = runner.next;
            current = current.next;
            
            while (!queue.isEmpty() && current != null && current.val <= queue.peek().val) {
                runner.next = current;
                runner = runner.next;
                current = current.next;
            }

            if(current != null){
                queue.add(current);
            }
        }

        return dummy.next;
    }
}
