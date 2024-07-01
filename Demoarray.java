package oops;
//Abstract class BankAccount
abstract class BankAccount {
 // Abstract method to calculate interest
 public abstract void calculateInterest();
}

//Concrete subclass SavingsAccount extending BankAccount
class SavingsAccount extends BankAccount {
 @Override
 public void calculateInterest() {
     // Implementing the calculateInterest method for savings account
     System.out.println("Calculating interest for Savings Account...");
     // Add specific logic for calculating savings account interest
 }
}

//Concrete subclass CheckingAccount extending BankAccount
class CheckingAccount extends BankAccount {
 @Override
 public void calculateInterest() {
     // Implementing the calculateInterest method for checking account
     System.out.println("Calculating interest for Checking Account...");
     // Add specific logic for calculating checking account interest
 }
}

//Main class to test the BankAccount subclasses
public class Main {
 public static void main(String[] args) {
     // Create objects of SavingsAccount and CheckingAccount
     BankAccount savingsAccount = new SavingsAccount();
     BankAccount checkingAccount = new CheckingAccount();

     // Call calculateInterest method for each account type
     savingsAccount.calculateInterest();
     checkingAccount.calculateInterest();
 }
}
