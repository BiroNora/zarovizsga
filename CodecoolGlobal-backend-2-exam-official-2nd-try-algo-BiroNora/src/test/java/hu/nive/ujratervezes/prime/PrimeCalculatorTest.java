package hu.nive.ujratervezes.prime;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PrimeCalculatorTest {
    private PrimeCalculator primeCalculator = new PrimeCalculator();

    @Test
    @Order(1)
    void test_min_zeroAsMin() {
        int[] intputArr = {2, 5, 0, 13, 4};
        assertEquals(0, primeCalculator.min(intputArr));
    }

    @Test
    @Order(2)
    void test_min_withArrayLengthZero_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> primeCalculator.min(new int[0]));
    }

    @Test
    @Order(3)
    void test_min_withNullParameter_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> primeCalculator.min(null));
    }

    @Test
    @Order(4)
    void test_isPrime() {
        assertTrue(primeCalculator.isPrime(5) && !primeCalculator.isPrime(12));
    }

    @Test
    @Order(5)
    void test_isPrime_for_even_numbers() {
        for (int i = 4; i < 100; i += 2)
            assertFalse(primeCalculator.isPrime(i), "%d - should not be a prime".formatted(i));
    }

    @Test
    @Order(6)
    void test_isPrime_for_primes() {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 73, 79, 83, 89, 97};
        for (int p : primes)
            assertTrue(primeCalculator.isPrime(p), "%d - should be a prime".formatted(p));
    }

    @Test
    @Order(7)
    void test_multiplyPrimesWithMinimum_zeroAsMin() {
        int[] intputArr = {2, 5, 0, 13, 4};
        int[] expected = {0, 0, 0, 0, 4};
        assertArrayEquals(expected, primeCalculator.multiplyPrimesWithMinimum(intputArr));
    }

    @Test
    @Order(8)
    void test_multiplyPrimesWithMinimum_twoAsMin() {
        int[] intputArr = {2, 5, 8, 13, 4, 6};
        int[] expected = {4, 10, 8, 26, 4, 6};
        assertArrayEquals(expected, primeCalculator.multiplyPrimesWithMinimum(intputArr));
    }

    @Test
    @Order(9)
    void test_multiplyPrimesWithMinimum_withNullParameter_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> primeCalculator.multiplyPrimesWithMinimum(null));
    }

    @Test
    @Order(10)
    void test_multiplyPrimesWithMinimum_withArrayLengthZero() {
        assertArrayEquals(new int[0], primeCalculator.multiplyPrimesWithMinimum(new int[0]));
    }
}