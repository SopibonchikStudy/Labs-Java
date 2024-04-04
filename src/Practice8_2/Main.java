package Practice8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        Sheep sheep = new Sheep(name, gender, age);
        System.out.println(sheep.getInfo());
    }
}
