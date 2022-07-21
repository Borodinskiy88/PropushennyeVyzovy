import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    protected Map<String, Contact>phone = new HashMap<>();

    public boolean addContact(Contact contact) {
        phone.put(contact.getPhoneNumber(), contact);
        return true;
    }

    public Contact searchContactNumber(String phoneNumber) {
        return phone.get(phoneNumber);
    }

    public static Contact madeContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

}
