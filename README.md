# RomanNumeralProject

## Using Our Code
The Roman Numeral Converter just requires an import of the package. The functions that can be used are all static so instantiation of the RomanNumeralConverter class is not needed.

### Converting from Roman Numerals to Arabic Numbers:
To convert from roman numerals you must pass the ```ConvertToArabic()``` function a valid roman numeral string in capital letters. If the string is invalid, the function will throw an InvalidRomanNumeralCharacterException that must be handled. The function will return an integer value.

Example:
```java
int arabicValue = RomanNumeralConverter.ConvertToArabic("IV");
System.out.println(arabicValue);
```

The example above will print out ```4```.

### Converting from Arabic Numbers to Roman Numerals:
To convert from arabic numbers to roman numerals you must pass the ```ConvertToRomanNumerals()``` function a positive, non-zero integer number. If the function is passed a negative number or zero, it will throw a WrongNumberFormatException that must be handled. The function will return a string of Roman Numeral characters.

Example:
```java
String romanNumerals = RomanNumeralConverter.ConvertToRomanNumerals(15);
System.out.println(romanNumerals);
```
The example above will print out ```"XV"```.

## Group Members
Mike Bastian - Created the README.md file and created unit tests.

Ryan Denney -

Ben Lawson - Added content to the README.md file, created the code for the RomanNumeralConverter class, and wrote unit testing for ```GetValueOfNumeral()``` and ```GetNumeralOfValue()```.

Justin Wynkoop -
