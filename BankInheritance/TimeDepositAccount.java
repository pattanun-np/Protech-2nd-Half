package BankInheritance;

public class TimeDepositAccount extends SavingsAccount {

        private int periodToMaturity;
        private static final double EARLY_PERNALTY = 20.0;
        private int count_of_months;

        public TimeDepositAccount(double rate, int month) {
                super(rate);
                periodToMaturity = month;
                count_of_months = 0;

        }

        public void deposit(double amount) {
                super.deposit(amount);
                periodToMaturity++;
        }

        public void withdraw(double amount) {
                if (count_of_months < periodToMaturity) {
                        super.withdraw(amount + EARLY_PERNALTY);

                } else {
                        super.withdraw(amount);
                }
        }

}
