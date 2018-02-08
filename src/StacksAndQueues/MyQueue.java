package StacksAndQueues;

import java.util.Stack;

// Implement a queue with two stacks
public class MyQueue {
    public static void main(String[] args){
        MyQueue q = new MyQueue();
        q.add(10);
        System.out.println("top: " + q.peek());
        q.add(11);
        System.out.println("top: " + q.peek());
        q.add(12);
        System.out.println("top: " + q.peek());
        q.add(13);
        System.out.println("top: " + q.peek());
        q.remove();
        System.out.println("top: " + q.peek());
        q.remove();
        System.out.println("top: " + q.peek());
        q.remove();
        System.out.println("top: " + q.peek());
        q.remove();
        System.out.println("top: " + q.peek());
    }
    Stack<Integer> insertStack, popStack;
    public MyQueue(){
        insertStack = new Stack<>();
        popStack = new Stack<>();
    }

    public int size(){
        return insertStack.size() + popStack.size();
    }

    public void add(int value){
        insertStack.push(value);
    }
    public int peek(){
        if (size() == 0) return Integer.MIN_VALUE;
        if (!popStack.isEmpty()){
            return popStack.peek();
        }
        while(!insertStack.isEmpty()){
            popStack.push(insertStack.pop());
        }
        return popStack.peek();
    }

    public int remove(){
        if (size() == 0) return Integer.MIN_VALUE;

        if (!popStack.isEmpty()){
            return popStack.pop();
        }
        while(!insertStack.isEmpty()){
            popStack.push(insertStack.pop());
        }
        return popStack.pop();

    }
}