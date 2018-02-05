package StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
    public static void main(String[] args){
        SetOfStacks ss = new SetOfStacks(5);
        int size = 24;
        for(int i = 0; i < size; i++){
            int v = (int)(Math.random() * 15);
            ss.push(v);
        }
        printStacks(ss);
        for(int c = size; c >= 0; c--){
            if (c % 5 == 2){
                printStacks(ss);
            }
            ss.pop();
        }
        printStacks(ss);
    }
    public static void printStacks(SetOfStacks ss){
        for(Stack<Integer> s : ss.stacks){
            for(int i = 0; i < s.size(); i++){
                System.out.print(s.elementAt(i) + ",");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    ArrayList<Stack<Integer>> stacks;
    int size;
    public SetOfStacks(int s){
        stacks = new ArrayList<>();
        size = s;
    }

    public void push(int v) {
        if (stacks.size() == 0){
            stacks.add(new Stack<>());
        }
        // existing stack is full, so add a new stack
        if (stacks.get(stacks.size()-1).size() == size){
            stacks.add(new Stack<>());
        }
        stacks.get(stacks.size()-1).push(v);
    }

    public int pop(){
        if (stacks.get(stacks.size()-1).size() == 0){
            stacks.remove(stacks.size()-1);
        }
        if (stacks.size() == 0){
            return Integer.MIN_VALUE;
        }
        return stacks.get(stacks.size()-1).pop();
    }
}
