import java.util.Stack;

public class MinStack1 {

    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    public MinStack1() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     * 插入
     * @param x
     */
    public void push(int x) {
        s1.push(x);
        if (s2.isEmpty() || x <= s2.peek()) {
            s2.push(x);
        }
    }

    /**
     * 弹出栈顶
     */
    public void pop() {
        if (s1.pop().equals(s2.peek())) {
            s2.pop();
        }
    }

    /**
     * 获取栈顶
     * @return
     */
    public int top() {
        return s1.peek();
    }

    /**
     * 获取最小值
     * @return
     */
    public int min() {
        return s2.peek();
    }
}
