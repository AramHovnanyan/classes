package bdgosahakyan.lesson_10;

public class MainAddress {
    public static void main(String[] args) {
        Address address = new Address("street", "city", "state", "zipCode");
        System.out.println(address.toString());
    }
}
