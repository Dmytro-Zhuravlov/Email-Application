import java.security.SecureRandom;
import java.util.Scanner;

public class Application {
    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        final String DOMAIN = ".aecompany.com";
        final String MAILBOXCAPACITY = "MAILBOX CAPACITY: 500mb";
        String department = "";
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("""
                Choose your department:
                1 for Sales
                2 for Development
                3 for Accounting
                0 for none""");
        byte numberOfDepartment = scanner.nextByte();
        switch (numberOfDepartment) {
            case 1 -> department = "Sales";
            case 2 -> department = "Development";
            case 3 -> department = "Accounting";
            case 0 -> department = "";
            default -> System.out.println("Such a department does not exist");
        }
        String email = name.toLowerCase() + "." + surname.toLowerCase() + "@" + department.toLowerCase() + DOMAIN;
                System.out.println("Department: " + department + "\nYour password: " + password() +
                "\nDisplay Name: " + name + " " + surname + "\nCompany email:\n" +
                email + "\n" + MAILBOXCAPACITY);
    }

    public static String password() {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_*№$%";
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < 10; i++){
            int randomIndex = secureRandom.nextInt(chars.length());
            password.append(chars.charAt(randomIndex));
        }
        return password.toString();
    }
}
