package taskPhoneBook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private static HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();

    static {
        phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 200 600"));
        phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
        phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String SearchName = reader.readLine();
        printNumbers(SearchName);
    }

    //вывод в консоль номеров
    public static void printNumbers(String name) {
        boolean chek = false;
        for (Map.Entry<String, List<String>> pair : phoneBook.entrySet()) {
            if (pair.getKey().equals(name)) {//если ключ соответствует введённому name
                chek = true;
                for (int i = 0; i < pair.getValue().size(); i++) {
                    System.out.println((i + 1) + ". " + pair.getValue().get(i));
                }
            }
        }
        if(!chek)
            System.out.println("Пользователь с данным ФИО отсутствует");
    }
}
