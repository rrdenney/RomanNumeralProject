package RomanNumeralTest;

import RomanNumeral.InvalidRomanCharacterException;
import RomanNumeral.RomanNumeralConverter;
import RomanNumeral.WrongNumberFormatException;
import org.junit.Assert;
import org.junit.Test;

public class JWYNKOOP {

    @Test
    public void ConvertToArabic_InvalidCharacter() {
        Exception exception = null;
        try {
            RomanNumeralConverter.ConvertToArabic("S");
        } catch (InvalidRomanCharacterException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
    }

    @Test
    public void ConvertToArabic_Lowercase() {
        Exception exception = null;
        try {
            RomanNumeralConverter.ConvertToArabic("v");
        } catch (InvalidRomanCharacterException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
    }


    @Test
    public void ConvertToArabic_V() {
        int value = 0;
        try {
            value = RomanNumeralConverter.GetValueOfNumeral("V");
        } catch (InvalidRomanCharacterException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(5, value);
    }

    @Test
    public void ConvertToArabic_IX() {
        int value = 0;
        try {
            value = RomanNumeralConverter.GetValueOfNumeral("IX");
        } catch (InvalidRomanCharacterException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(9, value);
    }

    @Test
    public void ConvertToArabic_AddValueToRunningTotal() {
        int value = 0;
        try {
            value = RomanNumeralConverter.ConvertToArabic("IX" + "I");

        } catch (InvalidRomanCharacterException e) {


        }
        Assert.assertEquals(10, value);
    }


}
