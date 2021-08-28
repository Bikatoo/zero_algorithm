import java.util.Stack;

public class CQueue {

    //用于入队
    private final Stack<Integer> s1;
    //用于出队
    private final Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     * 添加到末尾
     * @param value
     */
    public void appendTail(int value) {
        s1.push(value);
    }

    /**
     * 删除队列头
     * @return
     */
    public int deleteHead() {
        //如果s2里有元素，直接从s2里弹出
        if(!s2.isEmpty()) {
            return s2.pop();
        }
        //s2空了，将s1里的元素倒入s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        //转移完毕后，如果s2还是空的，说明队列是空的
        if (s2.isEmpty()) {
            return -1;
        }
        return s2.pop();
    }
}
