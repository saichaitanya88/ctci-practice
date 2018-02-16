package BitManipulation;

public class ApplyBitMaskWithBounds {
    public static void main(String[] args){
        runUpdateBits(1024, 21, 2, 6);
        runUpdateBits(1365, 31, 2, 6);
        runUpdateBits(1365, 0, 2, 6);
    }
    public static void runUpdateBits(int N, int M, int i, int j){
        System.out.println("Updated bits with N:" + N + " M:" + M + " i:" + j + " j:" + j + " O:" + updateBits(N, M, i, j));
    }
    public static int updateBits(int N, int M, int i, int j){
        int max = ~0; // invert 0, to get 32 1's
        int left = max - ((1 << j) - 1); // left bound => bits outside left bounds set to 0
        int right = ((1 << i) - 1); // right bound => bits outside right bounds set to 0
        int mask = left | right; // take only between left bounds and right bounds => bits outside bounds set to 0
        return (N & mask) | (M << i); // bit shift M by i bits; then apply the mask of M << i to N.
    }
}
