package RomanNumeral;

public class Main {
    public static void main(String[] args) {
            try {
                int value = RomanNumeralConverter.ConvertToArabic("XIX");
                System.out.println(value);

                String numerals = RomanNumeralConverter.ConvertToRomanNumerals(248);
                System.out.println(numerals);
            } catch (InvalidRomanCharacterException | WrongNumberFormatException e) {
                e.printStackTrace();
            }
    }
}
