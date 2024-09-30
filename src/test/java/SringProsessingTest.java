import org.example.StringProcessing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SringProsessingTest {
    @Test void isStrongPasswordTest() {
        StringProcessing sp = new StringProcessing();
        assertTrue(sp.isStrongPassword("Abubus123*"));
        assertTrue(sp.isStrongPassword("01kg674ach"));
        assertTrue(sp.isStrongPassword("roba_doba_du!"));
        assertTrue(sp.isStrongPassword("#gDdGq6|W"));
        assertTrue(sp.isStrongPassword("QWERTY321!"));
    }
    @Test void calculateDigitsTest() {
        StringProcessing sp = new StringProcessing();
        assertEquals(3, sp.calculateDigits("Abubus123"));
        assertEquals(1, sp.calculateDigits("Abubus1"));
        assertEquals(10, sp.calculateDigits("Abubus1231231231"));
        assertEquals(0, sp.calculateDigits("Abubus"));
        assertEquals(3, sp.calculateDigits("A1bu2us3"));
    }

    @Test void calculateWordsTest() {
        StringProcessing sp = new StringProcessing();
        assertEquals(3, sp.calculateWords(" anoba aboba du"));
        assertEquals(3, sp.calculateWords("anoba aboba du"));
        assertEquals(1, sp.calculateWords("anobaabobadu"));
        assertEquals(9, sp.calculateWords(" a n o b a a bo ba du"));
        assertEquals(2, sp.calculateWords(" anoba ab"));
    }
}
