import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    enum AuthenticationStatus{SUCCESS,FAIL};
    private User user;
    private ArrayList<Insurace> ınsuranceList;
    AuthenticationStatus status;
    private int type;

    final void showInfo(){
        System.out.println("This part gives customer information: ");
        System.out.println(user.getName()+user.getsName()+user.getAge());

    }
}
