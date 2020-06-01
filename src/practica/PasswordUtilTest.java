package practica;

import org.junit.Test;

import static org.junit.Assert.*;
import static practica.PasswordUtil.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(SecurityLevel.WEAK, assessPassword("1234567"));

    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(SecurityLevel.WEAK, assessPassword("abcdftgh"));

    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(SecurityLevel.MEDIUM, assessPassword("abcd1234"));

    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(SecurityLevel.STRONG, assessPassword("abcd123!"));

    }


}