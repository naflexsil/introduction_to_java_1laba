package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Main_make_installTest {
    @Test
    public void testReverseString() {
        // проверка переворота строки
        assertEquals("llatsni ekam", Main_make_install.reverseString("make install"));
    }
}