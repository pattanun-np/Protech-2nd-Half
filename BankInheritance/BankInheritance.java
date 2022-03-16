package BankInheritance;


public class BankInheritance {
    public static void main(String[] args) {
        SavingsAccount momSavingsAccount = new SavingsAccount(5);

        CheckingAccount harryChecking = new CheckingAccount(10000);

        momSavingsAccount.deposit(10000);

        TimeDepositAccount armTimeDepositAccount = new TimeDepositAccount(5, 3);

        harryChecking.withdraw(1500);
        harryChecking.deposit(1500);
        harryChecking.withdraw(1500);
        harryChecking.withdraw(400);

        armTimeDepositAccount.deposit(10000);
        armTimeDepositAccount.deposit(1000);
        armTimeDepositAccount.deposit(1000);
        armTimeDepositAccount.addInterest();
        armTimeDepositAccount.withdraw(10000);

        momSavingsAccount.addInterest();
        harryChecking.deductFees();

        System.out.println("Mom's Saving Account " + momSavingsAccount.getAccount_number() + " Balance = $" + momSavingsAccount.getBalance());

        System.out.println("Harry's Checking Account " + harryChecking.getAccount_number() + " Balance = $" + harryChecking.getBalance());

        System.out.println("Arm's TimeDeposit Account " + armTimeDepositAccount.getAccount_number() + " Balance = $" + armTimeDepositAccount.getBalance());
    }
}
