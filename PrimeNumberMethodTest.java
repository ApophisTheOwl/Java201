/**
 * Class: CMSC201 
 * Instructor: Grigoriy Gindberg
 * Description: Project 6 JUnit
 * Due: 05/6/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Rebecca Lawson
*/

import org.junit.*;
import static org.junit.Assert.*;

/** This class tests the isPrime method in PrimeNumberMethod */
public class PrimeNumberMethodTest 
{
	/** Data fields: primes and notPrimes for testing */
	private int prime1 = 2, 
		prime2 = 3, 
		prime3 = 5, 
		prime4 = 7, 
		notPrime1 = 4, 
		notPrime2 = 6, 
		notPrime3 = 8, 
		notPrime4 = 9;
	
	@Before 
	public void setUp() throws Exception {}
	
	/** Method for testing isPrime */
	@Test
	public void testIsPrime()
	{
		assertTrue(PrimeNumberMethod.isPrime(prime1));
		assertTrue(PrimeNumberMethod.isPrime(prime2));
		assertTrue(PrimeNumberMethod.isPrime(prime3));
		assertTrue(PrimeNumberMethod.isPrime(prime4));
		assertFalse(PrimeNumberMethod.isPrime(notPrime1));
		assertFalse(PrimeNumberMethod.isPrime(notPrime2));
		assertFalse(PrimeNumberMethod.isPrime(notPrime3));
		assertFalse(PrimeNumberMethod.isPrime(notPrime4));
	}
}
