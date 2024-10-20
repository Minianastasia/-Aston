package Lesson_14_junit_5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Lesson_14_junit {

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
    }
}
