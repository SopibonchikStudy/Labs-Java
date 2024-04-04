import java.util.Arrays;

public class Demo7_4 {
    public static void main(String[] args) {
        // Заполнить массив по произведению индексов, к которым прибавлена 1, красиво вывести
        int[][][] arr = new int[2][3][4];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 4; ++k) {
                    arr[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                }
            }
        }
        for (int i = 0; i < 2; ++i) {
            System.out.print('[');
            for (int j = 0; j < 3; ++j) {
                System.out.print('[' + Arrays.toString(arr[i][j]) + ']');
                if (j < 2) {
                    System.out.println(',');
                }

            }
            if (i != 1) {
                System.out.print(']');
                System.out.println(',');
                System.out.println();
            }

        }
    }
}
