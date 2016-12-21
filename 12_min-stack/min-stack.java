/*
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/min-stack
@Language: Java
@Datetime: 16-10-14 02:24
*/

public class MinStack {
    
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        // do initialize if necessary
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        stack.push(number);
        if (minStack.isEmpty()) {
            minStack.push(number);
        } else {
            minStack.push(minStack.peek() >= number ? number : minStack.peek());
        }
    }

    public int pop() {
        // write your code here

        minStack.pop();
        return stack.pop();
    }

    public int min() {
        // write your code here
        return minStack.peek();
    }
}
