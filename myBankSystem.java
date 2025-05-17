package javaTutMod;

import java.util.Scanner;

public class myBankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num = 4;
		
		while (num != 0) {
			System.out.println("Welcome to your banking choice: ");
			System.out.println("1 Check Balance ");
			System.out.println("2 Deposit");
			System.out.println("3 Withdraw");
			System.out.println("0 To exit");
			num = input.nextInt();
			
			if (num == 1) {
				double currentBalance = myBalance();
				System.out.println("Your current balance is " + currentBalance);
			}
			
			else if (num == 2) {
				System.out.println("Enter amount to deposit: ");
				
				double deposit = input.nextDouble();
				
				double newBalance = myDeposit(deposit);
								
				System.out.println("Your new Balance: " + newBalance); 
			}
			
			else if (num == 3) {
				System.out.println("Enter amount to withdraw: ");
				
				double withdraw = input.nextDouble();
				
				double newBalance = myWithdraw(withdraw);
				
				if (newBalance == -1)
					System.out.println("Not Enough Balance!");
				else								
					System.out.println("Your new Balance: " + newBalance);				
			}
			
			else if (num == 0)
				System.out.println("Thank you for your time with us!");
			
			else
				System.out.println("Invalid choice!");
		}
		
		input.close();
	}
	
	public static double myDeposit (double num) { return num = myBalance() + num; }
	
	public static double myBalance() { double balance = 1000; return balance; }
	
	public static double myWithdraw(double num) { 
		double balance = myBalance();
		if (balance < num || balance <= 0) 
			return -1;
		else
			return balance = myBalance() - num; 
	}

}
