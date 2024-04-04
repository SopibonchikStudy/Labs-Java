import java.util.Arrays;

public class Arraymntwo {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int k = 4;
        int[][][] trio = new int[n][m][k];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                for (int l = 0; l < k; l ++) {
                    trio[i][j][l] = (i+1) * (j+1) * (l+1);
                }
            }
        }
        for (int i = 0; i < 2; ++i) {
            System.out.print('[');
            for (int j = 0; j < 3; ++j) {
                System.out.print(Arrays.toString(trio[i][j]));
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
