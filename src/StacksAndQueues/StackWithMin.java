package StacksAndQueues;

public class StackWithMin {
    public static void main(String[] args){
        StackWithMin sm = new StackWithMin(6);
        sm.push(19);
        sm.push(12);
        sm.push(100);
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());
        sm.push(19);
        sm.push(19);
        sm.push(19);
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());
        sm.pop();
        print("min: ", sm.min());

    }
    public static void print(String a, Object b){
        System.out.println(a + " : " + b);
    }

    private Stack stack;
    private Stack min;
    public StackWithMin(int s){
        stack = new Stack(s);
        min = new Stack(s);
    }
    public int min(){
        if (min.isEmpty())
            return Integer.MAX_VALUE;
        else
            return min.peek();
    }
    public void push(int value){
        stack.push(value);
        if (value <= min()){
            min.push(value);
        }
    }
    public int pop(){
        int value = stack.pop();
        if (value <= min()){
            min.pop();
        }
        return value;
    }
}

class Stack{
    private int[] stack;
    private int counter;

    public Stack(int s){
        stack = new int[s];
        counter = 0;
    }
    public void push(int value){
        if (counter >= stack.length){
            //throw new StackOverflowError();
            return;
        }
        stack[counter] =  value;
        counter++;
    }
    public int pop(){
        if (counter == 0){
            //throw new IllegalArgumentException();
            return stack[counter];
        }
        int value = stack[counter - 1];
        stack[counter] = 0;
        counter--;
        return value;
    }
    public int peek(){
        if (counter <= 0)
            return stack[0];

        return stack[counter - 1];
    }
    public boolean isEmpty(){
        return counter == 0;
    }
}