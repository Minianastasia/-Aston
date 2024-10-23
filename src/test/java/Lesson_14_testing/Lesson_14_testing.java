package Lesson_14_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson_14_testing{

    @Test
    public void testFactorialPositiveNumber() {
        Assert.assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}
