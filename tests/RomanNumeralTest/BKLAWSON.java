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

}
