package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.algorithms.BinaryConvert.convertFromBinary;
import static com.algorithms.BinaryConvert.convertFromOctal;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BinaryConvertTest {



    @Test
    public void convertFromBinary_shouldPass_givenStringBinary_100101() {
        int result = convertFromBinary("100101");
        assertEquals(37, result);
    }
    // TODO-Lab1.3: After completing test plan, implement unit tests.
    @Test
    public void convertFromOctal_shouldbe16_givenStringOctal_20() {
            int result = convertFromOctal("20");
            assertEquals(16, result);
    }
    @Test (expected = IllegalArgumentException.class)
    public void convertFromOctal_shouldThrow_exception_eightStringPassed(){
            int result = convertFromOctal("8");
            fail("should have thrown illArgsExcept");
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertFromOctal_shouldThrow_exception_negativeStringPassed(){
        int result = convertFromOctal("-1");
        System.out.println(result);
        fail("should have thrown illArgsExcept");
    }
}
