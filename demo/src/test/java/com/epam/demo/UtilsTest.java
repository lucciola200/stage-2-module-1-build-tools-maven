package com.epam.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class UtilsTest {

    @Test
    public void testIsAllPositiveNumbersWithAllPositive() {
        assertTrue(Utils.isAllPositiveNumbers(Arrays.asList("1", "2", "3")),
                "All positive numbers should return true");
    }

    @Test
    public void testIsAllPositiveNumbersWithNegativeNumber() {
        assertFalse(Utils.isAllPositiveNumbers(Arrays.asList("1", "-2", "3")),
                "Including a negative number should return false");
    }

    @Test
    public void testIsAllPositiveNumbersWithZero() {
        assertFalse(Utils.isAllPositiveNumbers(Arrays.asList("0")),
                "Zero is not a positive number, should return false");
    }

    @Test
    public void testIsAllPositiveNumbersWithEmptyList() {
        assertTrue(Utils.isAllPositiveNumbers(Collections.emptyList()),
                "An empty list should return true as there are no non-positive numbers");
    }

    @Test
    public void testIsAllPositiveNumbersWithNull() {
        assertFalse(Utils.isAllPositiveNumbers(null),
                "Null input should return false");
    }

    @Test
    public void testIsAllPositiveNumbersWithNonNumericString() {
        assertFalse(Utils.isAllPositiveNumbers(Arrays.asList("1", "abc", "3")),
                "Non-numeric string should return false");
    }
}
