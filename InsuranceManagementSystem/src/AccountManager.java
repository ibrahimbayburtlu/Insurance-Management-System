import java.util.Scanner;

public class AccountManager {

    private static boolean flag = true;

    public void run(){
        Scanner input = new Scanner(System.in);
        int select;
        while (flag){
            System.out.println(" 1 - Create an Account"+
                    "\n 2 - Login to Account "+
                    "\n 3 - Exit "+
                    "\n 4 - Admin Login ");
            System.out.print("Select : ");
            select = input.nextInt();

            while (select > 0 || select < 5) {
                try {
                    if (select.equals("1")) {
                        // create a Account
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
                }catch (Exception e){
                    System.out.print("Error Messeage");
                }
            }
        }
    }
}
