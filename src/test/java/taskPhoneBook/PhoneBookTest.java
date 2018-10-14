package taskPhoneBook;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {

    @Test
    public void printNumbers() {

        assertEquals("ОЖИДАЮ: false",
                false,PhoneBook.printNumbers("Серёгин И.М."));
    }
}