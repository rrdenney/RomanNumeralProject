package RomanNumeral;

import java.util.*;

public class RomanNumeralConverter {
    private static ArrayList<String> romanLetterList;
    private static ArrayList<Integer> romanNumberList;

    static {
        romanLetterList = new ArrayList<>();
        romanLetterList.add("I");
        romanLetterList.add("IV");
        romanLetterList.add("V");
        romanLetterList.add("IX");
        romanLetterList.add("X");
        romanLetterList.add("XL");
        romanLetterList.add("XC");
        romanLetterList.add("L");
        romanLetterList.add("C");
        romanLetterList.add("CD");
        romanLetterList.add("CM");
        romanLetterList.add("D");
        romanLetterList.add("M");

        romanNumberList = new ArrayList<>();
        romanNumberList.add(1);
        romanNumberList.add(4);
        romanNumberList.add(5);
        romanNumberList.add(9);
        romanNumberList.add(10);
        romanNumberList.add(40);
        romanNumberList.add(90);
        romanNumberList.add(50);
        romanNumberList.add(100);
        romanNumberList.add(400);
        romanNumberList.add(900);
        romanNumberList.add(500);
        romanNumberList.add(1000);
    }

    public static int GetValueOfNumeral(String numeral) throws InvalidRomanCharacterException {
        if (!romanLetterList.contains(numeral)) throw new InvalidRomanCharacterException("Character '" + numeral + "' is not a valid Roman Numeral!");
        return romanNumberList.get(romanLetterList.indexOf(numeral));
    }

    public static String GetNumeralOfValue(int value) throws WrongNumberFormatException {
        if (!romanNumberList.contains(value)) throw new WrongNumberFormatException("Number " + value + " is not a number existing in the list!");
        return romanLetterList.get(romanNumberList.indexOf(value));
    }

    public static int ConvertToArabic(String romanNumerals) throws InvalidRomanCharacterException {
            // Check that the user did not put in any invalid characters
            for (int i = 0; i < romanNumerals.length(); i++) {
                String singleChar = String.valueOf(romanNumerals.charAt(i));
                if (!romanLetterList.contains(singleChar)) {
                    throw new InvalidRomanCharacterException("Character '" + singleChar + "' is not a valid roman letter!");
                }
            }

            int returnValue = 0;
            for (int i = 0; i < romanNumerals.length(); i++) {
                String c = String.valueOf(romanNumerals.charAt(i));
                // If the current letter is less than the next letter, we need to subtract the current letter from the next and add all that to our running total
                if (i != romanNumerals.length()-1 && GetValueOfNumeral(c) < GetValueOfNumeral(String.valueOf(romanNumerals.charAt(i+1)))) {
                    returnValue += GetValueOfNumeral(String.valueOf(romanNumerals.charAt(i+1))) - GetValueOfNumeral(c);
                    i++;

                    // Otherwise, just add that value to the running total
                } else {
                    returnValue += GetValueOfNumeral(c);
                }
            }

        return returnValue;
    }

    public static String ConvertToRomanNumerals(int arabic) throws WrongNumberFormatException {
        // Check if the number is zero or less and throw an error if it is
        if (arabic <= 0) throw new WrongNumberFormatException("Number cannot be zero or negative!");

        String returnValue = "";
        int runningValue = arabic;

        // Go through the number list in reverse
        for (int i = romanNumberList.size()-1; i >= 0; i--) {
            int currentNumber = romanNumberList.get(i);

            // Subtract from the running value and add the letter(s) to the list if it is larger than that number
            while (runningValue >= currentNumber) {
                returnValue += GetNumeralOfValue(currentNumber);
                runningValue -= currentNumber;
            }

            // Stop running through the list if the number has reached zero
            if (runningValue == 0) break;
        }

        return returnValue;
    }

}

