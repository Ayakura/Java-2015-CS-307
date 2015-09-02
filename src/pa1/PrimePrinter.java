package pa1;
import java.util.*;

/**
   Print all the prime numbers less than or equal to the number
   entered by the user.
   @author Anh-Phan Trinh
*/
public class PrimePrinter
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      PrimeGenerator generator = new PrimeGenerator(); //generator value with attribute of 1
      System.out.print("Enter an integer: ");
      int maxInt = in.nextInt();

      int prime = generator.nextPrime(); //assigning value of 2 to prime
      while (prime <= maxInt) // starting from 2 until equal maxInt
      {
    	  System.out.println(prime);
    	  prime = generator.nextPrime(); //continuously generating prime values after loop
      }
   }
}
