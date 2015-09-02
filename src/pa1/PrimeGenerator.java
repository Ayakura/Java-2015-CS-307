package pa1;
/**
   This class returns all the prime numbers,
   one at a time starting with 2.
   This class follows the "generator" pattern: each
   call to nextPrime() generates the next number in
   the series.
   @author Anh-Phan Trinh
*/
public class PrimeGenerator
{
   /**
     Initialize the PrimeGenerator object with the
     first number.
   */
	
   public PrimeGenerator()
   {
      current = 1;
   }

   /**
      Calculate the next prime number after current.
      @return the next prime number
   */
   public int nextPrime()
   {
      current++; // Increment past previous prime number.
 
      while (!isPrime(current)) //If not prime, current goes up by 1 until prime
      {
    	  current++;
      }

      return current; //returning the prime number
   }

   /**
      Determine whether the given number is prime.
      @param n Number to check
      @return true if prime, or false if not
   */
   public static boolean isPrime(int n)
   {
	   for (int i = 2; i < n; i++) //i increases up to n
	   {
		   if (n%i == 0) //if n/i sequence doesn't have any remainders, it's a prime
			   {
			   		return false; 
			   }
	   }
	   return true;
   }

   int current;
}
