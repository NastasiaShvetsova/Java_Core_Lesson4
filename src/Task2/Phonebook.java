package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private final Map<String, List<String>> phonebook_hm = new HashMap<>();

    public void add(String surname, String phoneNumber) {

        List<String> listPhoneNumber;

        if (phonebook_hm.containsKey(surname)) {
            listPhoneNumber = phonebook_hm.get(surname);
            listPhoneNumber.add(phoneNumber);
            phonebook_hm.put(surname, listPhoneNumber);
        } else {
            listPhoneNumber = new ArrayList<>();
            listPhoneNumber.add(phoneNumber);
            phonebook_hm.put(surname, listPhoneNumber);
        }
    }
    public List<String> get(String surname) {
        return phonebook_hm.get(surname);
    }
}
