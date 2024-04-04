package Practice8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = Integer.parseInt(scanner.nextLine());
        int h1 = Integer.parseInt(scanner.nextLine());
        int d2 = Integer.parseInt(scanner.nextLine());
        int h2 = Integer.parseInt(scanner.nextLine());
        Cone c1 = new Cone(d1, h1);
        Cone c2 = new Cone(d2, h2);
        System.out.println("Area = "+c1.countArea());
        System.out.println("Volume = "+c1.countVolume());
        System.out.println("Area = "+c2.countArea());
        System.out.println("Volume = "+c2.countVolume());
        System.out.println(c1.compare(c2));
    }
}
