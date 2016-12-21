```
@Copyright:LintCode
@Author:   JamY
@Problem:  http://www.lintcode.com/problem/min-stack
@Language: Markdown
@Datetime: 16-10-14 02:24
```

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
        if(minStack.isEmpty() || number < minStack.peek()){
            minStack.push(number);
        }
    }

    public int pop() {
        // write your code here
        if(minStack.peek() == stack.peek()){
            minStack.pop();
        }
        return stack.pop();
    }

    public int min() {
        // write your code here
        return minStack.pop();
    }
}
Running time error