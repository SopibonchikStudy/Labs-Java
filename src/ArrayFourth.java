import java.util.Arrays;
import java.util.Scanner;
public class ArrayFourth {
    public static void main(String[] args) {
        String[] arrayone;
        String[] arraytwo;
        Scanner scanner = new Scanner(System.in);
        String strone = scanner.nextLine();
        String strtwo = scanner.nextLine();
        String[] strokeone = strone.split(" ");
        arrayone = new String[strokeone.length];
        String[] stroketwo = strtwo.split(" ");
        arraytwo = new String[stroketwo.length];
        for (int i = 0; i < arrayone.length; i++) {
            arrayone[i] = strokeone[i];
        }
        for (int g = 0; g < arraytwo.length; g++) {
            arraytwo[g] = stroketwo[g];
        }
        String[] arraygeneral = new String[arrayone.length + arraytwo.length];
        for (int i = 0; i < arrayone.length; i ++) {
            arraygeneral[i] = arrayone[i];
        }
        for (int i = 0; i < arraytwo.length; i ++) {
            arraygeneral[arrayone.length + i] = arraytwo[i];
        }
        for (int m = 0; m < arraygeneral.length; m++){
            for (int n = m + 1; n < arraygeneral.length; n++) {
                if (arraygeneral[m].length() > arraygeneral[n].length()) {
                    String temp = arraygeneral[m];
                    arraygeneral[m] = arraygeneral[n];
                    arraygeneral[n] = temp;
                }
            }
        }
        for (String str : arraygeneral) {
            System.out.print(str + " ");
        }
    }
}
