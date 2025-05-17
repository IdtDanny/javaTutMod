package javaTutMod;

public class mainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500: ");
		BankAccount BA1234 = new BankAccount("BA1234", 500);
		
		// Deposit $1000 into Account BA1234
		System.out.println("Deposit $1000 into account BA1234:");
		BA1234.deposit(1000); // Depositing 1000
		System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

		// Withdraw $600 from account BA1234
		System.out.println("Withdraw $600 on account BA1234!");
		BA1234.withdraw(600);
		System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());
		
		// Create SavingAccount object (A/c No. "SA1234") with initial balance of $450
		System.out.println("\nCreate a Saving Account object (A/c No. SA1234) with initial balance of $450: ");
		SavingAccount SA1234 = new SavingAccount("SA1234", 450);
		
		// Withdraw $300 from SA1234
		SA1234.withdraw(300);
		System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());

		// Create SavingAccount object (A/c No. "SA1000") with initial balance of $300
		System.out.println("\nCreate a Saving Account object (A/c No. SA1000) with initial balance of $300: ");
		SavingAccount SA1000 = new SavingAccount("SA1000", 300);
		
		// Withdraw $300 from SA1234
		System.out.println("Try to withdraw $250 from SA1000!");
		SA1000.withdraw(250);
		System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
	
	}

}