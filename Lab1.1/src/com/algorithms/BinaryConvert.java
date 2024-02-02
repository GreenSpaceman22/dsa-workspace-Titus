package com.algorithms;

public class BinaryConvert {

    public static void main(String[] args) {
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary) {
        //-Lab1.1: return calculated decimal value converted from String binary

        int decimalValue = 0;
        int binaryLength = binary.length() - 1;
        for (int i = 0; i < binary.length(); i++) {
               int thisDigi = Character.getNumericValue(binary.charAt(i));
               decimalValue += thisDigi * Math.pow(2, binaryLength);
               binaryLength--;
           }
        return decimalValue;
    }

}
