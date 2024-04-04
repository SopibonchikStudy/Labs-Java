import java.util.Scanner;

public class Practice4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String temp = scanner.nextLine();
            if (temp.equalsIgnoreCase("stop")){
                System.out.println("Вы закончили, не успев начать");
                break;
            }
            int n = Integer.parseInt(temp);
            boolean flag = false;
            boolean search_active = true;
            String book = scanner.nextLine();
            if (book.equalsIgnoreCase("stop")){
                break;
            }
            int counter = 0;
            for(int i = 0; i < n; ++i){
                String tempBook = scanner.nextLine();
                if (tempBook.equalsIgnoreCase("stop")){
                    search_active = false;
                    break;
                }
                counter += 1;
                if (book.equals(tempBook)){
                    System.out.println("You checked "+(counter) + " books and found "+book);
                    flag = true;
                    break;
                }

            }
            if(!flag){
                System.out.println("You checked "+counter + " books and did not found "+book);
            }if (!search_active){
                break;
            }
        }
    }
}