```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/reverse-linked-list-ii
@Language: Markdown
@Datetime: 16-10-29 07:09
```

    public ListNode reverseBetween(ListNode head, int m , int n) {
    	if (head == null) {
    		return head;
    	}

    	ListNode dummy = new ListNode(1);
    	dummy.next = head;

    	ListNode start = getNode(dummy, m - 1);
    	ListNode end = getNode(dummy, n);

    	reverse(start, end);

    	return dummy.next;
    }

    public ListNode getNode(ListNode node, int n) {
    	while (node != null && n != 0) {
    		node  = node.next;
    		n--;
    	}
    	return node;
    }

    public void reverse(ListNode start, ListNode end) {
    	ListNode next;
    	ListNode runner = start.next;
    	while (start.next != end) {
    		next = runner.next;
    		start.next = runner.next;
    		runner.next = end.next;
    		end.next = runner;
    		runner = next;
    	}
    }