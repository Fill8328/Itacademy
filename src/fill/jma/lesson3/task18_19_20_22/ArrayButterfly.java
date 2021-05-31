package fill.jma.lesson3.task18_19_20_22;

public class ArrayButterfly {
    public static void butterfly(){
        int x = 5;
        int y = 5;
        int matrix[][] = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
                if (i > 0 && i <= x-2){
                    matrix[i][0] = 0;
                    matrix[i][y-1] = 0;
                }
                if (i > 1 && i <= x-3){
                    matrix[i][1] = 0;
                    matrix[i][y-2] = 0;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
