package javaTutMod;

import java.util.Scanner;

public class myBankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num = 5;
		do {
			System.out.println("Welcome to your banking choice: ");
			System.out.println("1 Check Balance ");
			System.out.println("2 Deposit");
			System.out.println("3 Withdraw");
			System.out.println("0 Exit");
			num = input.nextInt();
			
			if (num == 1) {
				double currentBalance = myBalance();
				System.out.println("Your current balance is " + currentBalance);
			}
		} while(num != 0);
		input.close();
	}
	
	public static double myDeposit (int num) {
		return num += num;
	}
	
	public static double myBalance() {
		int balance = 1000;
		return balance;
	}
	
	public static double myWithdraw(int num) {return num;}

}
