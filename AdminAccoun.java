import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

// class Custome implements Serializable {

//     private static final String RESET = "\u001B[0m";
//     private static final String YELLOW = "\u001B[33m";
//     private static final String RED = "\u001B[31m";
//     private static final String GREEN = "\u001B[32m";
//     private static final String BLUE = "\u001B[34m";

//     private String name;
//     private String accountNumber;

//     Custome(String name, String accountNumber) {
//         this.name = name;
//         this.accountNumber = accountNumber;
//     }

//     String getName() {
//         return name;
//     }

//     String getAccountNumber() {
//         return accountNumber;
//     }

//     public String toString() {
//         return extracted();
//     }

//     private String extracted() {
//         return "Name: " + name + "\nAccount Number: " + accountNumber;
//     }
// }

// class Admi {
//     private String username;
//     private String password;

//     Admi(String username, String password) {
//         this.username = username;
//         this.password = password;
//     }

//     boolean authenticate(String inputUsername, String inputPassword) {
//         return username.equals(inputUsername) && password.equals(inputPassword);
//     }

//     public String getUsername() {
//         return username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

// }

class Main implements Serializable {
    private static final String RESET = "\u001B[0m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {

        ArrayList<Customer1>customers = new ArrayList<>();
        Admi admin = new Admi("admin", "123");

        Scanner scanner = new Scanner(System.in);
        System.out.println(YELLOW + "Welcome to the Bank  System" + RESET);
        System.out.println("Enter your  choice ");

        System.out.println("Press 1 admin ");
        System.out.println("Press 2 user    ");

        int k = scanner.nextInt();

        switch (k) {
            case 1:
                System.out.println("Welcome to the Bank Admin System");

                while (true) {
                    System.out.println("\nPlease log in as admin:");
                    System.out.print("AdmiName: ");
                    String inputUsername = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("AdmiName Password: ");
                    String inputPassword = scanner.nextLine();

                    if (admin.authenticate(inputUsername, inputPassword)) {
                        while (true) {
                            System.out.println("\nChoose an option:");
                            System.out.println(
                                    GREEN + "----------------------------------------------------------------------------------------------------"
                                            + RESET);
                            System.out.println(
                                    GREEN + "|                                                                                                   |"
                                            + RESET);
                            System.out.println(
                                    GREEN + "|\t\t--------------------\t\t\t\t----------------------\t\t    |" + RESET);
                            System.out.println(
                                    GREEN + "|\t\t 1. Creat Acount   \t\t\t\t  2. V.account information   \t|" + RESET);
                            System.out.println(
                                    GREEN + "|\t\t--------------------\t\t\t\t----------------------\t\t    |" + RESET);
                            System.out.println(
                                    GREEN + "|\t\t--------------------\t\t\t\t----------------------\t\t    |" + RESET);
                            System.out.println(
                                    GREEN + "|\t\t 3. Remove/Block account   \t\t\t\t  4. account list    \t|" + RESET);
                            System.out.println(
                                    GREEN + "|\t\t--------------------\t\t\t\t----------------------\t\t    |" + RESET);
                            System.out.println(
                                    GREEN + "|                                                                                                   |");
                            System.out.println(
                                    "|\t\t 5 Logout    \t\t\t                                       |" + RESET);

                            System.out.println(
                                    GREEN + "----------------------------------------------------------------------------------------------------"
                                            + RESET);

                            System.out.print("Enter your choice: ");
                            int choice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            boolean flag = true;
                            switch (choice) {
                                case 1:
                                    System.out.print("Enter customer name: ");
                                    String name = scanner.nextLine();
                                    System.out.print("Enter account number: ");
                                    String accountNumber = scanner.nextLine();
                                    customers.add(new Customer1(name, accountNumber));
                                    System.out.println(YELLOW + "Account created successfully!" + RESET);
                                    Properties pro = new Properties();
                                    pro.setProperty("A", String.valueOf(customers));
                                    pro.setProperty("C", String.valueOf(admin.getUsername()));
                                    pro.setProperty("d", String.valueOf(admin.getPassword()));
                                    try (FileOutputStream fos = new FileOutputStream("devo.text", true)) {
                                        pro.store(fos, "my data");
                                        System.out.println(YELLOW + "data save successfully" + RESET);
                                    }

                                    catch (Exception e) {
                                    }

                                    try (FileInputStream fin = new FileInputStream("devo.text")) {
                                        pro.load(fin);
                                    }

                                    catch (Exception e) {
                                        e.printStackTrace();
                                    }

                                    break;
                                case 2:
                                    System.out.print(GREEN + "Enter account number to view: " + RESET);
                                    String accNumber = scanner.nextLine();

                                    for (Customer1 customer : customers) {
                                        if (customer.getAccountNumber().equals(accNumber)) {
                                            System.out.println(customer);
                                            flag = false;
                                            break;

                                        }
                                    }
                                    if (accNumber == "-1") {
                                        System.out.println(RED + "No account Present " + RESET);

                                    } else if (flag) {
                                        System.out.println(RED + "No Found  " + RESET);
                                    }

                                    break;
                                case 3:
                                    System.out.print(GREEN + "Enter account number to remove/block: " + RESET);
                                    String accNum = scanner.nextLine();
                                    for (Customer1 customer : customers) {
                                        if (customer.getAccountNumber().equals(accNum)) {
                                            customers.remove(customer);
                                            System.out.println(RED + "Account removed/blocked successfully!" + RESET);
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println(GREEN + "All accounts:" + RESET);
                                    for (Customer1 customer : customers) {
                                        System.out.println(customer);
                                    }
                                    break;
                                case 5:
                                    System.out.println(YELLOW + "Logged out." + RESET);
                                    return;
                                default:
                                    System.out.println(RED + "Invalid choice. Please try again." + RESET);
                                    break;
                            }
                        }
                    } else {
                        System.out.println(RED + "Invalid username or password. Please try again." + RESET);
                    }
                     break;

                }

                case 2:
                System.out.println("user ");
                break;

            default:
                System.out.println("Exex");
        }

    }
}
