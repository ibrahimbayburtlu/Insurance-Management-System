import java.util.Scanner;

import static sun.security.jgss.GSSUtil.login;

public class AccountManager {

    private static boolean flag = true;
    private static  Scanner input = new Scanner(System.in);
    public void run() {
        String select = "";
        while (flag) {
            System.out.println(" 1 - Create an Account" +
                    "\n 2 - Login to Account " +
                    "\n 3 - Exit " +
                    "\n 4 - Admin Login ");
            System.out.print("Select : ");
            select = input.nextLine();

            try {
                if (select.equals("1")) {
                    // create an Account
                    createAccount();
                } else if (select.equals("2")) {
                    // get both mail and password from the user
                    System.out.print("Enter email: ");
                    String email = input.nextLine();

                    System.out.print("Enter password: ");
                    String password = input.nextLine();

                    // let's login
                    login(email, password);
                } else if (select.equals("3")) {
                    flag = false;
                } else if (select.equals("4")) {
                    System.out.println("Printing all accounts and passwords in the system ...");
                    for (Account account : getAccounts()) {
                        System.out.println("Email :" + account.getUser().getEmail() + "\nPassword :" + a.getUser().getPassword());
                        System.out.println("Printing all InsuranceList in the system ...");
                        System.out.println("\nCustomer name: " + account.getUser().getName() + "\nInsurance Name: " + a.getInsuranceName() + "\nTotal price :" + account.getInsurancePrice());
                    }
                }
            } catch (Exception e) {
                System.out.print("Error Messeage");
            }
        }
    }

    private void login(String email, String password) {

    }

    public void createAccount() {
        String name, surName, email, password, job, age;
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter surName: ");
        surName = input.nextLine();
        System.out.print("Enter email: ");
        email = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
        System.out.print("Enter job: ");
        job = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextLine();

        User user = new User(name, surName, email, password, job, age);

        System.out.print("Are you individual (1 for yes 0 for no) :");
        name = input.nextLine();
        Account prop;
        if (name.equals("1")) {
            prop = new Individual(user);
        } else {
            prop = new Enterprise(user);
        }
        accounts.add(prop);
    }
}
