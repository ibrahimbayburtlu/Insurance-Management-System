import java.util.Scanner;
public interface Address {
    public void add(String address);
    public void remove();
    public void update(String address);
}

class HomeAddress implements Address{
    private String address;

    public HomeAddress(String address){
        this.address = address;
    }
    @Override
    public void add(String address){

    }

    public HomeAddress() {
        super();
    }

    @Override
    public void remove() {

    }

    @Override
    public void update(String address) {

    }
}
class BusinessAddres implements Address{
    private String address;
    public BusinessAddres(String address){
        this.address = address;
    }

    @Override
    public void add(String address) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void update(String address) {
    }
}
class AddresManager{
    public static void addAddress(User user,Address address){
        user.getAddressList().add(address);
    }
    public static void removeAddress(User user,Address address){
        user.getAddressList().remove(address);
    }
    public static Address createHomeAddress(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Home Addres : ");
        String homeadr= input.nextLine();
        return new HomeAddress(homeadr);
    }
    public  static Address createBusenessAddres(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Buseness Addres : ");
        String Busenessadr= input.nextLine();
        return new HomeAddress(Busenessadr);
    }
}
