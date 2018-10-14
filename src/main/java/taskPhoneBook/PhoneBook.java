package taskPhoneBook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private static HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();

    static {
        phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 200 600"));
        phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
        phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }
}
