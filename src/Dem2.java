import java.util.Arrays;

public class Dem2 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int k = 4;
        int [][][] trio = new int[n][m][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    trio[i][j][l] = (i + 1) * (j + 1) * (l+ 1);
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (i == n-1 && j == m-1) {
                    System.out.println("[" + Arrays.toString(trio[i][j]) + "]]");
                }
                else if (j == 0) System.out.println("[[" + Arrays.toString(trio[i][j]) + "],");
                else if ((i + 1) % m == 0 && j == 0) System.out.println("[[" + Arrays.toString(trio[i][j]) + "]]");
                else System.out.println("[" + Arrays.toString(trio[i][j]) + "],");
            }
            System.out.println();
        }
//        String a = Arrays.deepToString(trio);
//        a = a.replace("],", "],R");
//        String[] q =  a.split(",R ");
//        for (int i = 0; i < q.length; i++) {
//            if (i == q.length-1) System.out.println(q[i]);
//            else System.out.println(q[i] + ",");
//            if ((i + 1) % m == 0) System.out.println();
//        }
    }
}
