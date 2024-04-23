import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class RomanNumeralTest {
    @Test
    public void testSingleDigit() {
        // Test case to verify that single Roman numeral digits are correctly converted to integers.
        RomanNumeral rn = new RomanNumeral();
        assertEquals(1, rn.romanToInt("I")); // Test that 'I' correctly converts to 1
        assertEquals(5, rn.romanToInt("V"));
        assertEquals(10, rn.romanToInt("X"));
        assertEquals(50, rn.romanToInt("L"));
        assertEquals(100, rn.romanToInt("C"));
        assertEquals(500, rn.romanToInt("D"));
        assertEquals(1000, rn.romanToInt("M"));
    }
// Test case to verify the correct conversion of Roman numerals using subtractive notation.
    @Test
    public void testSubtractiveNotation() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(4, rn.romanToInt("IV")); // Test that 'IV' correctly converts to 4
        assertEquals(9, rn.romanToInt("IX"));
    }
// Test case to verify the correct conversion of complex Roman numerals involving multiple letters.
    @Test
    public void testMultipleLetters() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(1066, rn.romanToInt("MLXVI")); // Test that 'MLXVI' correctly converts to 1066
        assertEquals(1989, rn.romanToInt("MCMLXXXIX"));
    }
// Test case to verify that an empty string correctly returns 0.
    @Test
    public void testEmptyInput() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(0, rn.romanToInt(""));// Test that an empty string correctly converts to 0
    }

    @Test(expected = NullPointerException.class)
    public void testNullInput() {
        RomanNumeral rn = new RomanNumeral();
        rn.romanToInt(null);
    }
}
