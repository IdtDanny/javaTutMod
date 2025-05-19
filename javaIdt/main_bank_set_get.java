
package javaIdt;

public class main_bank_set_get {

    public static void main(String[] args) {
        BankAccount account_1 = new BankAccount();
        
        account_1.setAccount("H673256");
        account_1.setBalance(2000.32);
        
        String accountNumber = account_1.getAccount();
        double balance = account_1.getBalance();
        
        System.out.println("The account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
}
