package com.algorithms;

public class BinaryConvert {

    public static int convertFromBinary(String binary) {
        int numValue = Integer.parseInt(binary);
        if (numValue != 0 && Integer.parseInt(binary) >= 0) {
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
        else {
            throw new IllegalArgumentException();
        }
    }

    public static int convertFromOctal(String octal) {
        int numVersion = Integer.parseInt(octal,8);
        if (numVersion != 0 && Integer.parseInt(octal) >= 0) {
            int result = 0;
            int positionValue = 1;
            char[] digits = octal.toCharArray();
            for (int i = digits.length - 1; i >= 0; i--) {
                int digitValue = Character.getNumericValue(digits[i]);
                if (digitValue >= 0 && digitValue < 8) {
                    result += positionValue * digitValue;
                }
                positionValue *= 8;
            }
            return result;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

}
