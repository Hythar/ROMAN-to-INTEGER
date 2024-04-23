public class RomanNumeral {
//A static map to hold the Roman numeral characters and their integer values
    private static final java.util.Map<Character, Integer> map = new java.util.HashMap<>();
    // Static initializer block to populate the map with Roman numeral values
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
// Method to convert a Roman numeral string to an integer
    public int romanToInt(String s) {
        // If the input string is null, throw an exception to indicate a problem
        if (s == null) throw new NullPointerException("Input string is null");
        // Variable to store the converted integer value
        int convertedNumber = 0;
        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value of the current Roman numeral character
            int currentNumber = map.get(s.charAt(i));
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
            if (currentNumber >= next) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }
        // Return the total converted number after the loop
        return convertedNumber;
    }
}
