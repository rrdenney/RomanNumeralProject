package RomanNumeralTest;

import RomanNumeral.InvalidRomanCharacterException;
import RomanNumeral.RomanNumeralConverter;
import RomanNumeral.WrongNumberFormatException;
import org.junit.Assert;
import org.junit.Test;

public class BKLAWSON {

    // Get Numeral From Number Tests
    @Test
    public void GetNumeralFromNumber_InvalidNumber_Zero() {
        Exception exception = null;
        try {
            RomanNumeralConverter.GetNumeralOfValue(3);
        } catch (WrongNumberFormatException e) {
            exception = e;
        }
        Assert.assertNotEquals(null, exception);
    }

    @Test
    public void GetNumeralFromNumber_InvalidNumber_Negative() {
        Exception exception = null;
        try {
            RomanNumeralConverter.GetNumeralOfValue(-2);
        } catch (WrongNumberFormatException e) {
            exception = e;
        }
        Assert.assertNotEquals(null, exception);
    }

    @Test
    public void GetNumeralFromNumber_One() {
        String numeral = "";
        try {
            numeral = RomanNumeralConverter.GetNumeralOfValue(1);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("I", numeral);
    }

    // Get Number From Numeral Tests
    @Test
    public void GetNumberFromNumeral_InvalidCharacter_Empty() {
        Exception exception = null;
        try {
            RomanNumeralConverter.GetValueOfNumeral("");
        }catch (InvalidRomanCharacterException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
    }

    @Test
    public void GetNumberFromNumeral_InvalidCharacter_NotInList() {
        Exception exception = null;
        try {
            RomanNumeralConverter.GetValueOfNumeral("S");
        }catch (InvalidRomanCharacterException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
    }

    @Test
    public void GetNumberFromNumeral_I() {
        int value = 0;
        try {
            value = RomanNumeralConverter.GetValueOfNumeral("I");
        } catch (InvalidRomanCharacterException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1, value);
    }

    @Test
    public void GetNumberFromNumeral_IV() {
        int value = 0;
        try {
            value = RomanNumeralConverter.GetValueOfNumeral("IV");
        } catch (InvalidRomanCharacterException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(4, value);
    }
/*
    // Convert to Numerals from Number Exception Throwing Tests
    @Test
    public void ToNumerals_InvalidNumber_Zero() {
        Exception output = null;
        try {
            RomanNumeralConverter.ConvertToRomanNumerals(0);
        } catch (WrongNumberFormatException e) {
            output = e;
        }

        Assert.assertNotEquals(null, output);
    }

    @Test
    public void ToNumerals_InvalidNumber_Negative() {
        Exception output = null;
        try {
            RomanNumeralConverter.ConvertToRomanNumerals(-2);
        } catch (WrongNumberFormatException e) {
            output = e;
        }

        Assert.assertNotEquals(null, output);
    }

    // Convert to Numerals from Number
    @Test
    public void ToNumerals_SingleDigit_One() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(1);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("I", numerals);
    }

    @Test
    public void ToNumerals_SingleDigit_Three() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(3);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("III", numerals);
    }

    @Test
    public void ToNumerals_SingleDigit_Four() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(4);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("IV", numerals);
    }

    @Test
    public void ToNumerals_SingleDigit_Five() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(5);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("V", numerals);
    }

    @Test
    public void ToNumerals_SingleDigit_Eight() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(8);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("VIII", numerals);
    }

    @Test
    public void ToNumerals_SingleDigit_Nine() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(9);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("IX", numerals);
    }

    @Test
    public void ToNumerals_LargeNumber() {
        String numerals = null;
        try {
            numerals = RomanNumeralConverter.ConvertToRomanNumerals(47);
        } catch (WrongNumberFormatException e) {
            e.printStackTrace();
        }

        Assert.assertEquals("XLVII", numerals);
    }

    // Convert Numeral to Number Tests
*/

}
