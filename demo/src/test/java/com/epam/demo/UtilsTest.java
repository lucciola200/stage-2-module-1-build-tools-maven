package com.epam.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilsTest {

    @Test
    public void testAllPositiveNumbersWithPositiveNumbers() {
        List<String> numbers = Arrays.asList("1", "2", "3");
        assertTrue(Utils.isAllPositiveNumbers(numbers));
    }

    @Test
    public void testAllPositiveNumbersWithNegativeNumber() {
        List<String> numbers = Arrays.asList("1", "-2", "3");
        assertFalse(Utils.isAllPositiveNumbers(numbers));
    }

    @Test
    public void testAllPositiveNumbersWithNonNumber() {
        List<String> numbers = Arrays.asList("1", "abc", "3");
        assertFalse(Utils.isAllPositiveNumbers(numbers));
    }

    @Test
    public void testAllPositiveNumbersWithEmptyList() {
        List<String> numbers = Collections.emptyList();
        assertTrue(Utils.isAllPositiveNumbers(numbers));
    }

    @Test
    public void testAllPositiveNumbersWithNullList() {
        assertFalse(Utils.isAllPositiveNumbers(null));
    }
}
