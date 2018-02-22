package BitManipulation;

public class BitSwapsRequired {
    public static void main(String[] args){
        int a = 31;
        int b = 14;
        System.out.println("Bit swaps required to convert " + a + " to " + b +  " : "  + getBitSwapsRequired(a,b));
    }
    public static int getBitSwapsRequired(int a, int b){
        int count = 0;
        for (int c = a ^ b; c != 0; c = c >> 1){
            count += c & 1;
        }
        return count;
    }
}
