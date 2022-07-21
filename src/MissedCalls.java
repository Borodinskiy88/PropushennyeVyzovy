import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

import static java.time.LocalDateTime.now;

public class MissedCalls {
    protected Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addMissedCall(String phoneNumber) {
        storage.put(now(), phoneNumber);
    }


    public String loseCalls(PhoneBook phoneBook) {
        for (Map.Entry<LocalDateTime, String> local : storage.entrySet()) {
            Contact contact = phoneBook.searchContactNumber(local.getValue());
            String nameOrNumber = contact != null ? contact.getName() : local.getValue();
            System.out.println(local.getKey() + " -> " + nameOrNumber);
        }
        return null;
    }
}

