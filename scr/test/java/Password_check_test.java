import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Password_check_test {

    @BeforeAll
    static void init(){
    }

    @BeforeEach
    void setUp(){
    }

    @Test
    public void testLengthOK(){
        String pwLengthGood = "abcdefghijk";
        assertTrue(Password_check.passwordLength(pwLengthGood));

    }

    @Test
    public void testLengthTooShort(){
        String pwLengthTooShort = "abcd";
        assertFalse(Password_check.passwordLength(pwLengthTooShort));
    }

    @Test
    public void testLengthTooLong(){
        String pwLengthTooLong = "abcdefghijkl12345678ffffffff";
        assertFalse(Password_check.passwordLength(pwLengthTooLong));
    }

    @Test
    public void testUpperLowerCase(){
        String pwUpPass = "ABCDE";
        String pwUpFail = "abcde";
        assertTrue(Password_check.passwordUppercase(pwUpPass));
        assertFalse(Password_check.passwordUppercase(pwUpFail));
    }

    @Test
    public void testLowerCase(){
        String pwLowPass = "abcde";
        String pwLowFail = "ABCDE";
        assertTrue(Password_check.passwordLowercase(pwLowPass));
        assertFalse(Password_check.passwordLowercase(pwLowFail));
    }

    @Test
    public void testNumbers(){
        String pwWithNumbers = "123testpass";
        String pwWithoutNumbers = "testpass";
        assertTrue(Password_check.passwordContainsNumbers(pwWithNumbers));
        assertTrue(Password_check.passwordContainsNumbers(pwWithoutNumbers));
    }

    @Test
    public void testSymbols(){
        String pwWithSymbols1 = "test(";
        String pwWithSymbols2 = "test)";
        String pwWithSymbols3 = "test#";
        String pwWithSymbols4 = "test$";
        String pwWithSymbols5 = "test?";
        String pwWithSymbols6 = "test!";
        String pwWithSymbols7 = "test%";
        String pwWithSymbols8 = "test/";
        String pwWithSymbols9 = "test@";

        String pwWihoutSymbols = "test";

        String pwWithOtherSymbol = "test§";

        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols1));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols2));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols3));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols4));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols5));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols6));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols7));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols8));
        assertTrue(Password_check.passwordContainsSymbols(pwWithSymbols9));

        assertTrue(Password_check.passwordContainsSymbols(pwWihoutSymbols));

        assertTrue(Password_check.passwordContainsSymbols(pwWithOtherSymbol));
    }
    /* in Progress
    @Test
    public void checkOngoingNumbersTrue(){
        String pwOngoing = "123test";
        boolean actual = Password_check.pwContainsOngoingNumbers(pwOngoing);
        Assertions.assertEquals(actual, false);
    }

    @Test
    public void checkOngoingNumbersFalse(){
        String pwNotOngoing = "145test";
        boolean actual = Password_check.pwContainsOngoingNumbers(pwNotOngoing);
        Assertions.assertEquals(actual, true);
    }
    */

}
