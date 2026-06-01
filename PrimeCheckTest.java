import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
    // ------------------------------------------------------------------------- //
    @Test
    public void TestNegativeNumbers() {
        for (int i = -10; i < 0; ++i) {
            assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
        }
    }

    // ------------------------------------------------------------------------- //
    @Test
    public void TestEdgeCases() {
        assertEquals("Test 0", false, PrimeCheck.isPrime(0));
        assertEquals("Test 1", false, PrimeCheck.isPrime(1));
        assertEquals("Test 2", true, PrimeCheck.isPrime(2));
    }

    // ------------------------------------------------------------------------- //
    @Test
    public void testPrimes() {
        /* Korrigierter Test für Primzahlen */
        assertEquals("Test 3", true, PrimeCheck.isPrime(3));
        assertEquals("Test 5", true, PrimeCheck.isPrime(5));
        assertEquals("Test 7", true, PrimeCheck.isPrime(7));
        assertEquals("Test 11", true, PrimeCheck.isPrime(11));
    }

    // ------------------------------------------------------------------------- //
    @Test
    public void testNonPrimes() {
        /* Korrigierter Test für Nicht-Primzahlen */
        assertEquals("Test 4", false, PrimeCheck.isPrime(4));
        assertEquals("Test 9", false, PrimeCheck.isPrime(9));
        assertEquals("Test 15", false, PrimeCheck.isPrime(15));
        assertEquals("Test 20", false, PrimeCheck.isPrime(20));
    }
}