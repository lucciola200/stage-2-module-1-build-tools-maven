
import com.epam.utils.StringUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testIsPositiveNumberWithPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("12"));
    }

    @Test
    public void testIsPositiveNumberWithNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-5"));
    }

    @Test
    public void testIsPositiveNumberWithNonNumericString() {
        assertFalse(StringUtils.isPositiveNumber("abc"));
    }
}
