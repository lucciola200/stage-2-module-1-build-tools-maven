package com.epam.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsPositiveNumberWithPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("12"), "12 should be considered a positive number");
    }

    @Test
    public void testIsPositiveNumberWithNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-5"), "-5 should not be considered a positive number");
    }

    @Test
    public void testIsPositiveNumberWithZero() {
        assertFalse(StringUtils.isPositiveNumber("0"), "0 should not be considered a positive number");
    }

    @Test
    public void testIsPositiveNumberWithNonNumericString() {
        assertFalse(StringUtils.isPositiveNumber("abc"), "Non-numeric string should not be considered a positive number");
    }

    @Test
    public void testIsPositiveNumberWithEmptyString() {
        assertFalse(StringUtils.isPositiveNumber(""), "Empty string should not be considered a positive number");
    }

    @Test
    public void testIsPositiveNumberWithNull() {
        assertFalse(StringUtils.isPositiveNumber(null), "Null should not be considered a positive number");
    }
}
