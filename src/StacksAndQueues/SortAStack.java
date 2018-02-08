package StacksAndQueues;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 15; i++){
            stack.push((int)(Math.random() * 25));
        }
        print(stack);
        print(sort(stack));
    }

    public static Stack<Integer> sort(Stack<Integer> stack){
        Stack<Integer> sorted = new Stack<>();
        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!sorted.isEmpty() && sorted.peek() > temp){
                stack.push(sorted.pop());
            }
            sorted.push(temp);
        }
        return sorted;
    }

    public static void print(Stack<Integer> stack){
        for(int i = 0; i < stack.size(); i++){
            System.out.print("" + stack.elementAt(i) + ",");
        }
        System.out.println("");
    }
}
