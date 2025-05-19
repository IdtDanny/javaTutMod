
package javaIdt;

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public String getAccount() {
        return accountNumber;
    }
    
    public void setAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance (double new_balance) {
        this.balance = new_balance;
    }
}
