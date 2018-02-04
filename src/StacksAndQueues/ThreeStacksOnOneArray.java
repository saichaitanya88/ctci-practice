package StacksAndQueues;

public class ThreeStacksOnOneArray {
    public static void main(String[] args) throws Exception {
        stack1();
    }
    public static void stack1() throws Exception{
        ThreeStacksOnOneArray stack = new ThreeStacksOnOneArray(3);
        System.out.println(stack.peek(0));
        stack.push(0, 1); stack.print();
        stack.push(0, 2); stack.print();
        stack.push(0, 3); stack.print();
        // stack.push(0, 3); stack.print(); // -> stackoverflow
        stack.push(1, 4); stack.print();
        stack.push(1, 5); stack.print();
        stack.pop(1); stack.print();
        stack.pop(1); stack.print();
        stack.pop(1); stack.print(); // -> does nothing
        stack.push(1, 16); stack.print();
        System.out.println(stack.peek(0));
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(2));
    }
    private int[] stacks;
    private int[] sizes;
    public ThreeStacksOnOneArray(int n){
        stacks = new int[n*3];
        sizes = new int[3];
    }
    public boolean empty(int n){
        return sizes[n] == 0;
    }
    public int peek(int n){
        // n * 3 + sizes[n]
        int index = (n*3) + sizes[n]-1;
        if (index < 0)
            return stacks[0];
        return stacks[index];
    }
    public int pop(int n){
        // n * 3 + sizes[n]
        int offset = sizes[n]-1;
        int index = (n*3) + offset;
        if (offset < 0){
            return 0;
        }
        int value = stacks[index];
        stacks[index] = 0;
        sizes[n]--;

        return value;
    }
    public int push(int n, int v){
        int index = (n*3) + sizes[n];
        if (sizes[n] >= stacks.length / 3)
            throw new StackOverflowError();
        stacks[index] = v;
        sizes[n]++;
        return v;
    }
    public void print(){
        for(int i = 0; i < stacks.length; i++){
            System.out.print("" + stacks[i]);
            if (i % 3 == 2){
                System.out.print("  |  ");
            }
            else{
                System.out.print(",");
            }
        }
        System.out.println("");
    }
}