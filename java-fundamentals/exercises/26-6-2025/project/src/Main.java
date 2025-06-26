    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //Getting user credentials
            System.out.println("Welcolme to the bank!");
            System.out.println("Please enter your name: ");
            String name = scan.nextLine();
            System.out.println("Please enter your starting balance: ");
            double balance = Double.parseDouble(scan.nextLine());
            System.out.println("Please enter your account type: (Savings or Checking)");
            String accountType = scan.nextLine();

            //Showing user credentials
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balance);
            System.out.println("Account Type: " + accountType);

            //Menu
            while (true) { String menu = "Please select an option:\n" +
                    "1. Deposit\n" +
                    "2. Consult balance\n" +
                    "3. Transfer\n" +
                    "4. Exit\n";
            System.out.println(menu);
            int option = Integer.parseInt(scan.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("How much would you like to deposit?");
                        Double deposit = Double.parseDouble(scan.nextLine());
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("You deposited $" + deposit);
                        System.out.println("Your new balance is $" + balance);
                        break;
                    case 2:
                        System.out.println("Your balance is $" + balance);
                        break;
                    case 3:
                        System.out.println("How much would you like to transfer?");
                        Double transfer = Double.parseDouble(scan.nextLine());
                        if (transfer > balance) {
                            System.out.println("Insufficient balance. Transfer canceled.");
                        } else {
                            balance -= transfer;
                            System.out.println("Transfer successful!");
                            System.out.println("You transferred $" + transfer);
                            System.out.println("Your new balance is $" + balance);
                        }
                        break;
                    case 4:
                        System.out.println("You selected to exit!");
                        System.out.println("Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                }
            }
        }
    }
