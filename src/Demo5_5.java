import java.util.Scanner;

public class Demo5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (isPalindrome(formatString(str))) System.out.println("'" + str + "' is palindrome");
        else System.out.println("'" + str + "' is not palindrome");
    }

    static boolean isPalindrome(String msg) {
        if (msg.isEmpty() || msg.length() == 1) return true;
        else{
            if(msg.charAt(0) != msg.charAt(msg.length()-1)){
                return false;
            }else{
                return isPalindrome(msg.substring(1,msg.length()-1));
            }
        }
    }

    static String formatString(String str) {
        return str.replaceAll(" ", "").replaceAll(",","").replace("!", "").replace(".", "").toLowerCase();
    }
}
