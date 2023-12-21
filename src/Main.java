import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter username");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        if (userName.equals("")) {
            System.out.println("Error! Please re-enter");
        } else {
            String UpperUserName = userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase(Locale.ROOT).trim();
            System.out.println("Hello " + UpperUserName);

        }

    }
}