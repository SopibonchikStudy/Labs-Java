package Demo8_6;

import java.util.Scanner;

public class Main {
    public static BankAccount[] accounts = new BankAccount[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountCount = 1;
        System.out.println(
                "Добро пожаловать в систему банка. Команды:\n" +
                        "create - создать новый банковский аккаунт\n" +
                        "set interest {проценты} - поменять ставку\n" +
                        "add deposit {id аккаунта} {количество денег} - внести депозит\n" +
                        "get interest {id аккаунта} {количество лет} - получить проценты\n" +
                        "end - выйти из системы"
        );
        String command = "";
        while (!(command.equalsIgnoreCase("exit"))) {
            command = scanner.nextLine();
            String[] commandArr = command.split(" ");
            if (commandArr.length == 0) {
                System.out.println("Invalid input");
                continue;
            }
            else if (commandArr.length == 1) {
                if (command.equalsIgnoreCase("create")) {
                    accounts[accountCount] = new BankAccount();
                    System.out.println("Account ID" + (accountCount++) + " created");
                }
                else if (command.equalsIgnoreCase("end")) break;
            } else if (commandArr.length == 3 && (commandArr[0] + " " + commandArr[1]).equalsIgnoreCase("set interest")) {
                BankAccount.setInterestRate(Integer.parseInt(commandArr[2]));
                System.out.println("Change interest Rate");
            } else if ((commandArr[0] + " " + commandArr[1]).equalsIgnoreCase("add deposit")) {
                if (Integer.parseInt(commandArr[2]) >= accountCount) {
                    System.out.println("Account ID" + commandArr[2] + " does not exist");
                    continue;
                }
                accounts[Integer.parseInt(commandArr[2])].deposit(Double.parseDouble(commandArr[3]));
                System.out.println(String.format(
                        "Deposited %f to ID%d",
                        Double.parseDouble(commandArr[3]), Integer.parseInt(commandArr[2])
                ));
            } else if ((commandArr[0] + " " + commandArr[1]).equalsIgnoreCase("get interest")) {
                if (Integer.parseInt(commandArr[2]) >= accountCount) {
                    System.out.println("Account ID" + commandArr[2] + " does not exist");
                    continue;
                }
                System.out.println(accounts[Integer.parseInt(commandArr[2])].getInterest(Integer.parseInt(commandArr[3])));

            }


        }
    }
}
