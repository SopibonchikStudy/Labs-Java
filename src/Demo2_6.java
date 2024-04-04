import java.util.Scanner;

public class Demo2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница" ->
                    "workday";
            case "Saturday", "Sunday", "Суббота", "Воскресенье" -> "holiday";
            default -> "invalid weekday";
        };
        System.out.println(result);
    }
}
