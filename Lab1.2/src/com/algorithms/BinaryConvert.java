package com.algorithms;

public class BinaryConvert {

    public static void main(String[] args) {
        int value = convertFromBinary("100101");
        System.out.println("Decimal value of binary 100101 = " + value);
        // Lab1.2: Uncomment first 2 and/or last 2 lines of
        //  the following, for a simple check of octal or
        //  hexadecimal conversion.
        value = convertFromOctal("17");
        System.out.println("Decimal value of octal 17 = " + value);
        value = convertFromHexadecimal("2A");
        System.out.println("Decimal value of hexadecimal 2A = " + value);
    }

    public static int convertFromBinary(String binary) {
        int result = 0;
        int positionValue = 1;
        char[] digits = binary.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += positionValue;
            }
            positionValue *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        int decimalValue = 0;
        int octalLength = octal.length() - 1;
        for (int i = 0; i < octal.length(); i++) {
            int thisDigi = Character.getNumericValue(octal.charAt(i));
            decimalValue += thisDigi * Math.pow(8, octalLength);
            octalLength--;
        }
        return decimalValue;
    }

    public static int convertFromHexadecimal(String hexadecimal) {
        // Lab1.2: Complete this method, to return calculated
        int decimalValue = 0;
        int hexadecimalLength = hexadecimal.length() - 1;
        for (int i = 0; i < hexadecimal.length(); i++) {
            int thisDigi = Character.getNumericValue(hexadecimal.charAt(i));
            decimalValue += thisDigi * Math.pow(16, hexadecimalLength);
            hexadecimalLength--;
        }
        return decimalValue;
    }

}
