package Recursion;

public class NthFibonacci {
    public static void main(String[] args){
        System.out.println("fibonacci(5): " + fibonacci(5));
        System.out.println("fibonacci(2): " + fibonacci(2));
        System.out.println("fibonacci(0): " + fibonacci(0));
        System.out.println("fibonacci(-1): " + fibonacci(-1));
        System.out.println("fibonacci(15): " + fibonacci(15));
    }

    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n > 1)
            return fibonacci(n-1) + fibonacci(n-2);
        else
            return -1;
    }
}
