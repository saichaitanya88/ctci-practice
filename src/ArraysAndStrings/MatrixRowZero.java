package ArraysAndStrings;

public class MatrixRowZero {
    // Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0
    public static void main(String[] args){
        int size = 6;
        int[][] input = new int[size][size];
        for (int i = 0; i < size; i++){
            for(int j =0; j < size; j++){
                input[i][j] = (int) (Math.random() * 6);
                System.out.print("" + input[i][j] + ", ");
            }
            System.out.println();
        }
        MatrixRowZero mr = new MatrixRowZero();

        System.out.println(" => ");
        int[][] zeroed = mr.setZeros(input);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("" + zeroed[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public int[][] setZeros(int[][] input){
        if (input == null || input.length == 0)
            return input;
        if (input[0] == null || input[0].length == 0)
            return input;

        boolean[] rowF = new boolean[input.length];
        boolean[] colF = new boolean[input[0].length];

        for(int i = 0; i < input.length; i ++){
            for(int j = 0; j < input[i].length; j++){
                if (input[i][j] == 0){
                    rowF[i] = true;
                    colF[j] = true;
                }
            }
        }

        for(int i = 0; i < rowF.length; i++){
            for(int j = 0; j < input[i].length; j++){
                if (rowF[i] || colF[j])
                    input[i][j] = 0;
            }
        }
        return input;
    }
}