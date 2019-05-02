import java.util.Scanner;
public class showgreetings {
    public static void main(String[] args) {
        String names;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names : ");
        names = scanner.nextLine();
        System.out.println("Hello " + names);
    }
}
