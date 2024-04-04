import java.util.Scanner;

public class Practice2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start_time_string = scanner.nextLine();
        int start_time = Integer.parseInt(start_time_string.substring(0, 2)) * 60 + Integer.parseInt(start_time_string.substring(3, 5));
        int duration = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int res = start_time+duration+stop;
        String answer = (res %(24*60) > 600? (res %(24*60))/60: "0" + (res %(24*60))/60) +":" + (res %60>10? Integer.toString(res%60):"0"+Integer.toString(res%60));
        System.out.println(answer);
    }

}
