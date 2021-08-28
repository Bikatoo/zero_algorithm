public class MinStack2 {

    private int min = Integer.MAX_VALUE;
    private final int[] stack;
    private int popIndex;

    public MinStack2() {
        stack = new int[40000];
        popIndex = 0;
    }

    public void push(int x) {
        if (x <= min) {
            stack[++popIndex] = min;
            min = x;
        }
        stack[++popIndex] = x;
    }

    public void pop() {
        if (min == stack[popIndex]) {
            min = stack[--popIndex];
        }
        popIndex--;
    }

    public int top() {
        return stack[popIndex];
    }

    public int min() {
        return min;
    }
}
