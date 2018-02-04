package ArraysAndStrings;

public class MatrixRotate {
    public static void main(String[] args){
        int size = 4;
        int[][] input = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j =0; j < size; j++){
                input[i][j] = (int) (Math.random() * 6);
                System.out.print("" + input[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println(" => ");
        MatrixRotate mr = new MatrixRotate();
        int[][] rotated = mr.rotate(input);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("" + rotated[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public int[][] rotate(int[][] input){
        for(int layer = 0; layer < input.length / 2; layer++){
            int first = layer;
            int last = input.length - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = input[first][i];
                input[first][i] = input[last-offset][first];
                input[last-offset][first] = input[last][last - offset];
                input[last][last-offset] = input[i][last];
                input[i][last] = top;
            }
        }
        return input;
    }
}
