package pa2;
import java.util.Scanner;

/**
   A class to test an array of BankAccounts.
   @author Anh-Phan Trinh
*/
public class BankArrayTester {

	/**
	 * Test building an array of BankAccounts
	 * and then print the total and average balances.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of bank accounts: ");
		int numAccounts = in.nextInt();

		BankAccount[] accounts = new BankAccount[numAccounts];
		
		//start loop
		for (int i = 0; i < numAccounts; i++)
		{
			Scanner stdin1 = new Scanner(System.in); //prompts for number of accounts
			System.out.print("Enter account number for account " + (i+1) + ": "); //account has to start from 1, hence i+1
			int accountNum = stdin1.nextInt(); 
			//1st attribute of BankAccount is stored
			
			Scanner stdin2 = new Scanner(System.in);
			System.out.print("Enter balance for account " + (i+1) + ": ");
			Double accountBal = stdin2.nextDouble(); //input in the .pdf is a Double type
			//2nd attribute of BankAccount is stored
			
			accounts[i] = new BankAccount(accountNum, accountBal); 
			//added entities with BankAccount attribute to the array
		}
		//end loop

		double totalBalance = 0;
		
		for (int j = 0; j < numAccounts; j++)
		{
			totalBalance += accounts[j].getBalance(); //added the balance from getBalance() to the total
		}

		System.out.printf("The total balance is %.2f\n", totalBalance);
		System.out.printf("The average balance is %.2f\n", totalBalance / numAccounts);
	}
}
