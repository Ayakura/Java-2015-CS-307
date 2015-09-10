package pa2;
/**
  A bank account has a balance that can be changed by 
  deposits and withdrawals.
*/
public class BankAccount
{
	private double balance;
	private int accountNumber;

	/**
	   Constructs a bank account with a zero balance.
	*/
	public BankAccount(int _accountNumber)
	{   
	   balance = 0;
	}
	
	/**
	   Constructs a bank account with a given balance.
	   @param initialBalance the initial balance
	*/
	public BankAccount(int _accountNumber, double initialBalance)
	{   
	   accountNumber = _accountNumber;
	   balance = initialBalance;
	}
	
	/**
	   Deposits money into the bank account.
	   @param amount the amount to deposit
	*/
	public void deposit(double amount)
	{  
	   double newBalance = balance + amount;
	   balance = newBalance;
	}
	
	/**
	   Withdraws money from the bank account.
	   @param amount the amount to withdraw
	*/
	public void withdraw(double amount)
	{   
	   double newBalance = balance - amount;
	   balance = newBalance;
	}
	
	/**
	   Gets the current balance of the bank account.
	   @return the current balance
	*/
	public double getBalance()
	{   
	   return balance;
	}

	/**
	   Gets the account number of the bank account.
	   @return the account number
	*/
	public double getAccountNumber()
	{   
	   return accountNumber;
	}
}