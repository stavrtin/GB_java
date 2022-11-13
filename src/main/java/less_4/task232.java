package less_4;

import java.util.Stack;

public class task232 {
    private Stack<Integer> stacklIn = new Stack<>();
    private Stack<Integer> stacklOut = new Stack<>();

    public static void main(String[] args) {
        System.out.println("Задача 232 - очередь с помощью 2х стеков");

//        System.out.println(push(2));
    }

    public void MyQueue() {

    }

    public void push(int x) {
        stacklIn.push(x);
    }

    public int pop() {
        if (stacklOut.isEmpty()) {
            while (!stacklIn.isEmpty())
                stacklOut.push(stacklIn.pop());
        }
        return stacklOut.pop();
    }
//
    public int peek() {
        if (!stacklOut.isEmpty()) {
            return stacklOut.peek();
        } else {
            while (!stacklIn.isEmpty())
                stacklOut.push(stacklIn.pop());
        }
        return stacklOut.peek();
    }

    public boolean empty() {
            return stacklIn.isEmpty() && stacklOut.isEmpty();
    }
}



