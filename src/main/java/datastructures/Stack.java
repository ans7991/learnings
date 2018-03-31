package datastructures;

public class Stack {

    private int[] numbers = new int[20];
    private int top = -1;

    public void push(Integer x) {
        numbers[++top] = x;
    }

    public int pop() {
        return numbers[top--];
    }
}
