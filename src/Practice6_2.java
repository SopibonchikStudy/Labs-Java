import java.util.Scanner;

public class Practice6_2 {
    public static void main(String[] args) {
        // вывод строк, совпадающей длины в двух массивах
        Scanner scanner = new Scanner(System.in);
        String[] str1 = scanner.nextLine().split(" ");
        String[] str2 = scanner.nextLine().split(" ");
        String res = "";
        for (int i = 0; i < str1.length; ++i) {
            for (int j = 0; j < str2.length; ++j) {
                if (str1[i].length() == str2[j].length()) {
                    res += str1[i] + " " + str2[j] + " ";
                }
            }
        }
        System.out.println(res.trim());
    }
}
