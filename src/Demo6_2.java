import java.util.Scanner;

public class Demo6_2 {
    public static void main(String[] args) {
        // Сумма четных чисел и сумма чисел, кратных n = 5
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int res1 = 0;
        int res2 = 0;
        int n = 5;
        for(String el : str){
            int num = Integer.parseInt(el);
            if(num % 2 == 0) res1 += num;
            if(num % n == 0) res2 += num;
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}
