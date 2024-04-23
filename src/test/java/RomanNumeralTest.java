import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class RomanNumeralTest {
    @Test
    public void testSingleDigit() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(1, rn.romanToInt("I"));
        assertEquals(5, rn.romanToInt("V"));
        assertEquals(10, rn.romanToInt("X"));
        assertEquals(50, rn.romanToInt("L"));
        assertEquals(100, rn.romanToInt("C"));
        assertEquals(500, rn.romanToInt("D"));
        assertEquals(1000, rn.romanToInt("M"));
    }

    @Test
    public void testSubtractiveNotation() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(4, rn.romanToInt("IV"));
        assertEquals(9, rn.romanToInt("IX"));
    }

    @Test
    public void testMultipleLetters() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(1066, rn.romanToInt("MLXVI"));
        assertEquals(1989, rn.romanToInt("MCMLXXXIX"));
    }

    @Test
    public void testEmptyInput() {
        RomanNumeral rn = new RomanNumeral();
        assertEquals(0, rn.romanToInt(""));
    }

    @Test(expected = NullPointerException.class)
    public void testNullInput() {
        RomanNumeral rn = new RomanNumeral();
        rn.romanToInt(null);
    }
}