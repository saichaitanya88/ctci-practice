package BitManipulation;

public class SwapOddEvenBits {
    public static void main(String[] args){
        int a = 241;
        System.out.println("swap : " + a + " is " + swap(a));
    }
    public static int swap(int x){
        int even = (x & 0xaaaaaaaa) >> 1;
        int odd = (x & 0x55555555) << 1;
        return even | odd;
        //return ( ((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1) );
    }
}
